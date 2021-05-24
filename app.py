from flask.helpers import url_for
from flask_sqlalchemy import SQLAlchemy
from flask import Flask, abort, redirect, request, render_template, jsonify
import os
from flask_restx import inputs
from collections import OrderedDict


app = Flask(__name__)
app.secret_key = os.urandom(64)
app.config['SQLALCHEMY_DATABASE_URI'] = "postgresql://qhofauqprqwnbf:1df14c58e7da5c5ef27824a5e7d35459a014ba6624ba9677aa568c8b0b6a6cac@ec2-35-174-35-242.compute-1.amazonaws.com:5432/dfqukk8b3bu2ks"
db = SQLAlchemy(app)


@app.route('/health', methods=['GET'])
def health():
    return "I'm online"


@app.errorhandler(404)
def handle_bad_request(e):
    print(e.description)
    return render_template('404_error.html', e=e.description), 404


@app.route('/', methods=['GET'])
def format_page():
    return render_template('formatter.html')


@app.route('/italicized-words')
def italicized_words():
    words = [entry.word for entry in DB_Entry.query.filter(
        DB_Entry.italicized == True)]
    return render_template("italicized_words.html", italicized=words)


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


@app.route('/add_spellings')
def new_spellings():
    return render_template('add_spellings.html')


@app.route('/add_word_spellings', methods=['POST'])
def add_spellings():
    json = request.get_json()
    word = json.get("word")
    spellings = json.get("spellings")
    if word is None or spellings is None:
        abort(404, "Need Word and Spellings arguments")
    italicize = json.get("italicize")

    for alt_spelling in spellings:
        _addWord(alt_spelling, italicize, word)
    _commitDB()
    print(f"Added {word} with spellings {spellings}")
    return jsonify("Success")


@app.route('/add_word', methods=["POST"])
def add_word():
    word = request.args.get("word")
    italicized = request.args.get("italicized", type=inputs.boolean)
    if word is None or italicized is None:
        abort(404, "Did not include word or italicized")
    correct_spelling = request.args.get("correct_spelling")
    _addWordAndCommit(word, italicized, correct_spelling)
    print(f"Added ({word}, {italicized}, {correct_spelling})")
    return f"Added ({word}, {italicized}, {correct_spelling})"


def _addWord(word: str, italicized: bool, correct_spelling: str = None):
    print(f"Adding ({word}, {italicized}, {correct_spelling})")
    db.session.add(DB_Entry(word, italicized, correct_spelling))


def _addWordAndCommit(word: str, italicized: bool, correct_spelling: str = None):
    _addWord(word, italicized, correct_spelling)
    _commitDB()


@app.route('/delete_spelling', methods=["POST"])
def delete_spelling():
    spelling = request.get_json().get("spelling")
    if spelling is None:
        abort(404, "no spelling received")
    _deleteSpellingAndCommit(spelling)
    return "Success!"


def _deleteSpelling(spelling: str):
    print(f"Deleting spelling of {spelling}")
    DB_Entry.query.filter(DB_Entry.word == spelling).delete()


def _deleteSpellingAndCommit(spelling: str):
    _deleteSpelling(spelling)
    _commitDB()


def _commitDB():
    db.session.commit()


@app.route('/autocorrected-words')
@app.route('/glossary')
@app.route('/words')
def autocorrected_words():
    alt_spellings = {}
    italicized_words = []
    for entry in DB_Entry.query.all():
        spelling = entry.correct_spelling
        if spelling is None:
            continue
        if spelling in alt_spellings:
            alt_spellings[spelling].append(entry.word)
        else:
            alt_spellings[spelling] = [entry.word]
            if entry.italicized:
                italicized_words.append(spelling)

    suggestions = sum([len(values) for _, values in alt_spellings.items()])

    return render_template('autocorrected_words.html', corrected=sortDict(alt_spellings),  italicized=italicized_words, num_words=len(alt_spellings.keys()), num_suggestions=suggestions)


@app.route('/lookup_word')
def lookup_word():
    spelling = request.args.get("word")
    if spelling is None:
        abort(404, "need word argument")
    entry = _lookup(spelling)
    return jsonify(None if entry is None else entry.dict_representation())


def _lookup(spelling):
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

    def dict_representation(self):
        return {"italicized": self.italicized, "word": self.word, "correct_spelling": self.correct_spelling}


def makeReplacement(word: str) -> str:
    entry = _lookup(word)
    if entry is None:
        return word
    out = entry.correct_spelling if entry.correct_spelling is not None else word
    if entry.italicized:
        out = italicizeWord(out)
    print(f"Replacing {word} with {out}")
    return out


def italicizeWord(word: str) -> str:
    return f"<em>{word}</em>"


if __name__ == "__main__":
    app.run(debug=True, development=True)
    format_page()


@app.route('/format', methods=["POST"])
def format_text():
    text = request.get_json().get("text")
    if text is None:
        abort(404, "need text")
    fixed_text = buildFixedText(text)
    out = fixed_text.replace("</em> <em>", " ").replace("<p></p><p>", "<p>")
    out = out.replace("I.e.", "i.e.")
    return jsonify(out)


def buildFixedText(text: str) -> str:
    out = ""
    prev = None
    c = None
    i = -1
    curStr = ""
    while i < len(text)-1:
        i += 1
        prev = c
        c = text[i]
        if prev is not None and prev.isspace() and (c == '-' or c == '–'):
            tmp_i, tmp_out = handleHebrewQuotations(text[i+1:])
            out += tmp_out
            i += tmp_i
            c = text[i]
            if tmp_i == 0:
                break
        if c.isalpha() or c == "\'":
            curStr += c
            continue
        out += makeReplacement(curStr) + _parseChar(c, False)
        curStr = ""
        if (c == '?' or c == "!"):
            i += 1
            if (i == len(text)):
                continue
            prev = text[i]
            i += 1
            c = text[i]
            if (i == len(text)):
                out += prev
                continue
            if prev.isalpha():
                curStr += prev
            else:
                out += "</p><p>" if prev == '\r' or prev == '\n' else prev
                c = c.upper()
            if c.isalpha():
                curStr += c
            else:
                out += "</p><p>" if c == '\r' or c == '\n' else c
    return out + makeReplacement(curStr)


def _parseChar(c: str, isRTL: bool) -> str:
    if c == '\n' or c == '\r':
        return "<br>" if isRTL else "<p>"
    return c


def handleHebrewQuotations(text: str):
    i = 0
    c = text[i]
    whitespace = ""
    hasNewLine = False
    while c.isspace():
        if i == len(text):
            break
        hasNewLine = hasNewLine or c == '\n' or c == '\r'
        whitespace += c
        i += 1
        c = text[i]
    if hasNewLine and isHebrewLetter(c) and i < len(text):
        return handleDashNewlineAndHebrew(text[i:], c)
    out = handleDashNoHebrewQuote(whitespace)
    return i, out


def handleDashNewlineAndHebrew(text: str, c: str):
    out = "\n<p dir=\"rtl\"> " + c
    if len(text) == 1:
        return c, out
    i = 1
    c = text[i]
    while i < len(text) and (isPunctuation(c) or c.isspace() or isHebrewLetter(c)):
        if c == '\n' or c == '\r':
            cNext = c
            while cNext.isspace():
                i += 1
                cNext = text[i]
            if isHebrewLetter(cNext):
                out += "<br>"
            else:
                return i, out + "</p><p>"
            c = cNext
        out += _parseChar(c, True)
        i += 1
        c = None if i == len(text) else text[i]
    if i == len(text):
        i = 0
    return i, out + "</p><p>"


def isPunctuation(char: str) -> bool:
    punctuationMarks = ".,,:;!'\"()[]-–"
    return char in punctuationMarks


def handleDashNoHebrewQuote(whitespace: str) -> str:
    newWS = "-"
    for i in range(len(whitespace)):
        newWS += "<p>" if whitespace[i] == '\n' or whitespace[i] == '\r' else whitespace[i]
    return newWS


def isHebrewLetter(s: str):
    return any("\u0590" <= c <= "\u05EA" for c in s)


def sortDict(d: dict) -> dict:
    sorted_d = OrderedDict()
    sorted_keys = sorted(d.keys(), key=str.casefold)
    for key in sorted_keys:
        sorted_d[key] = d[key]
    return sorted_d
