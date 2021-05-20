from flask_sqlalchemy import SQLAlchemy
from flask import Flask, abort, request, render_template, jsonify
import worker
import rq
import time
import os
from flask_restx import inputs
from collections import OrderedDict


app = Flask(__name__)
app.secret_key = os.urandom(64)
app.config['SQLALCHEMY_DATABASE_URI'] = "postgresql://qhofauqprqwnbf:1df14c58e7da5c5ef27824a5e7d35459a014ba6624ba9677aa568c8b0b6a6cac@ec2-35-174-35-242.compute-1.amazonaws.com:5432/dfqukk8b3bu2ks"
db = SQLAlchemy(app)

SQLALCHEMY_TRACK_MODIFICATIONS = False
q = rq.Queue(connection=worker.conn)


@app.route('/health', methods=['GET'])
def health():
    return "I'm online"


@app.errorhandler(404)
def handle_bad_request(e):
    print(e.description)
    return render_template('404_error.html', e=e.description), 404


def runner(text):
    import os
    with open("RDLH_in.txt", "w") as input_text:
        input_text.write(text)
    os.system("javac FormatText.java")
    os.system("java FormatText < RDLH_in.txt > RDLH_out.txt")
    with open("RDLH_out.txt", "r") as out:
        return out.read()


@app.route('/format', methods=['POST'])
def formatter():
    args = request.get_json()
    text = args['text']

    with open("RDLH_in.txt", "w+") as input_text:
        input_text.write(text)

    job = q.enqueue(runner, args=(text,), result_ttl=10)
    start = time.time()
    while job.result is None and time.time() - start < 10:
        continue
    return jsonify(job.result)


@app.route('/', methods=['GET'])
def format_page():
    return render_template('RDLH.html')


@app.route('/autocorrected-words')
@app.route('/glossary')
@app.route('/words')
def autocorrected_words():
    words, corrected = parse_auto_correct_file(True)
    suggestions = sum([len(values) for _, values in corrected.items()])

    return render_template('autocorrected_words.html', corrected=corrected,  italicized=words, num_words=len(corrected.keys()), num_suggestions=suggestions)


@app.route('/italicized-words')
def italicized_words():
    words, _ = parse_auto_correct_file()
    return render_template("italicized_words.html", italicized=words)


def parse_auto_correct_file(get_auto_correct_values=False):
    with open("AutoCorrect.java") as ac:
        lines = ac.read().split(";\n")
    words = []
    corrected = {}
    for i in range(len(lines)):
        words_in_line = lines[i].split()
        for j in range(len(words_in_line)):
            if words_in_line[j] == "italicizedArr":
                words = handle_italicized(words_in_line, j)
            if get_auto_correct_values and words_in_line[j] == "switch":
                corrected = handle_switch(lines, i, j)
    return words, corrected


def handle_switch(lines, start, first_line_start):
    correct = {}
    first_line = str(lines[start]).splitlines()[4:]
    key, val = parse_statement_in_switch("\n".join(first_line))
    correct[format_term(key)] = sorted(val, key=str.casefold)
    for i in range(start + 1, len(lines)):
        if "}" in lines[i]:
            break
        key, val = parse_statement_in_switch(lines[i])
        if key and val:
            correct[format_term(key)] = sorted(val, key=str.casefold)
    return correct


def parse_statement_in_switch(lines):
    values = []
    for line in lines.splitlines():
        if "return" in line:
            key = str(line[line.find("return") + 7:])
            if key.find("\"") >= 0:
                key = key.replace("\"", "")
                key = key + \
                    "__TITLECASE" if key.replace("'", "").istitle() else key
            return key, values
        if "case" in line:
            i = line.find("case") + 6
            end = line.rfind("\"")
            values.append(line[i:end])
        elif "default" in line:  # should be default
            return None, None
    raise ValueError("Must have a return statement")


def handle_italicized(line, start):
    words = []
    for word in line[start+3:-1]:
        if not word:
            continue
        if "\"" in word:
            words.append(word.split("\"")[1])
        else:
            words.append(format_term(word.split(",")[0]))
    return sorted(words, key=str.casefold)


def format_term(term):
    words = term.replace("___", " ")
    compounds = words.split("__")
    if len(compounds) == 1:
        return words.lower().replace("_", "'")
    for i in range(len(compounds)):
        compounds[i] = compounds[i].replace("_", "'").lower()

    if compounds[1] == "lowercase":
        return compounds[0].lower()
    if compounds[1] == "uppercase":
        return compounds[0].upper()
    if compounds[1] == "titlecase":
        word = compounds[0].title()
        if "'" in word:
            j = word.find("'")
            word = word[:j+1] + word[j+1].lower() + word[j+2:]
        return word
    if compounds[1] == "b'titlecase":
        return "B'" + compounds[0][1:].title()
    if compounds[1] == "be'titlecase":
        return "Be" + compounds[0][2:].title()
    if compounds[1] == "bi'titlecase":
        return "Bi" + compounds[0][2:].title()
    if compounds[1] == "de'titlecase":
        return "De" + compounds[0][2:].title()
    if compounds[1] == "le'titlecase":
        return "Le" + compounds[0][2:].title()
    if compounds[1] == "ha'titlecase":
        return "Ha" + compounds[0][2:].title()
    if compounds[1] == "mi'titlecase":
        return "Mi" + compounds[0][2:].title()
    if compounds[1] == "she'titlecase":
        return "She" + compounds[0][3:].title()
    return " ".join(compounds)


@app.route("/sefaria-asks")
def sefaria_asks():
    texts = {}
    turim = {"Yoreh De'ah": "YD", "Orach Chayim": "OC",
             "Even HaEzer": "EH", "Choshen Mishpat": "CM"}

    texts["Eliyah Rabbah on Shulchan Arukh, Orach Chayim"] = [
        "Eliyah Rabah OC", "Eliyah Rabah", "Eliyah Rabbah", "Eliyah Rabbah OC"]
    texts["Sha'arei Teshuvah on Shulchan Arukh, Orach Chayim"] = [
        "Sha'arei Teshuva, OC", "Sha'arei Teshuva OC", "Sha'arei Teshuvah, OC", "Sha'arei Teshuvah OC"]

    for name in ["Tur", "Beit Yosef", "Arukh HaShulchan",  "Kaf HaChayim"]:
        texts[f"{name}, Orach Chaim"] = [f"{name}, Orach Chayim", f"{name} OC"]
        texts[f"{name}, Yoreh Deah"] = [f"{name}, Yoreh De'ah", f"{name} YD"]
    for tur, abbre in turim.items():
        texts[f"Darchei Moshe, {tur}"] = [
            f"Darchei Moshe {abbre}", f"Darkhei Moshe {abbre}", f"Darkei Moshe {abbre}"]
        texts[f"Be'er Hetev on Shulchan Arukh, {tur}"] = [
            f"Be'er Hetev, {tur}", f"Be'er Hetev {abbre}", f"Be'er Hetev, {abbre}", f"Be'eir Heiteiv, {tur}", f"Be'eir Heiteiv {abbre}", f"Be'er Heiteiv, {abbre}", f"Be'eir Heiteiv on Shulchan Arukh, {tur}"]
        texts[f"Rabbi Akiva Eiger on Shulchan Arukh, {tur}"] = [
            f"Rabbi Akiva Eiger {abbre}", f"Rabbi Akiva Eiger, {abbre}"]
        if abbre != "OC" and abbre != "YD":  # if not OC nor YD
            texts[f"Tur, {tur}"] = [f"Tur {tur}", f"Tur {abbre}"]
            texts[f"Beit Yosef, {tur}"] = [
                f"Beit Yosef {tur}", f"Beit Yosef {abbre}"]
            texts[f"Arukh HaShulchan, {tur}"] = [
                f"Arukh HaShulchan {abbre}"]
        if abbre != "OC":
            texts[f"Pithei Teshuva on Shulchan Arukh, {tur}"] = [
                f"Pithei Teshuva, {abbre}", f"Pithei Teshuva {abbre}", f"Pitchei Teshuva, {abbre}", f"Pitchei Teshuva {abbre}"]
    return render_template("/sefaria_asks.html", texts=OrderedDict(sorted(texts.items())))


@app.route('/add_word')
def add_word():
    word = request.args.get("word")
    italicized = request.args.get("italicized", type=inputs.boolean)
    if word is None or italicized is None:
        abort(404, "Did not include word or italicized")
    correct_spelling = request.args.get("correct_spelling")
    _addWord(word, italicized, correct_spelling)
    return f"Added ({word}, {italicized}, {correct_spelling})"


def _addWord(word: str, italicized: bool, correct_spelling: str = None):
    print(f"Adding ({word}, {italicized}, {correct_spelling})")
    db.session.add(DB_Entry(word, italicized, correct_spelling))
    db.session.commit()


@app.route('/import_from_document')
def import_from_document():
    DB_Entry.query.delete()  # delete all stuff in the table
    italicized_words, alt_spellings = parse_auto_correct_file(True)
    for correct_word in alt_spellings.keys():
        italicized = correct_word in italicized_words
        for alt_spell in alt_spellings[correct_word]:
            _addWord(alt_spell, italicized, correct_word)
    return show_db()


@app.route('/show_db')
def show_db():
    alt_spellings = {}
    italicized_words = []
    for word in DB_Entry.query.all():
        spelling = word.correct_spelling
        if spelling in alt_spellings.keys():
            alt_spellings[spelling].append(word.word)
        else:
            alt_spellings[spelling] = [word.word]
            if word.italicized:
                italicized_words.append(spelling)

    suggestions = sum([len(values) for _, values in alt_spellings.items()])

    return render_template('autocorrected_words.html', corrected=alt_spellings,  italicized=italicized_words, num_words=len(alt_spellings.keys()), num_suggestions=suggestions)


def look_up(spelling):
    return DB_Entry.query.filter(DB_Entry.word == spelling).one_or_none()


class DB_Entry(db.Model):
    # __tablename__ = 'words'

    word = db.Column(db.String, primary_key=True)
    italicized = db.Column(db.Boolean)
    correct_spelling = db.Column(db.String)

    def __init__(self, word: str, italicized: bool, correct_spelling: str = None):
        self.word = word
        self.italicized = italicized
        self.correct_spelling = correct_spelling


if __name__ == "__main__":
    app.run(debug=True, development=True)
    format_page()
