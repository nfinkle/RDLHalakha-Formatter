from flask import Flask, request, render_template, jsonify
import worker
import rq
import time
import os
from flask_restx import inputs
from collections import OrderedDict


app = Flask(__name__)
app.secret_key = os.urandom(64)
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
    if compounds[1] == "ha'titlecase":
        return "Ha" + compounds[0][2:].title()
    if compounds[1] == "she'titlecase":
        return "She" + compounds[0][3:].title()
    return " ".join(compounds)


@app.route("/sefaria-asks")
def sefaria_asks():
    texts = {}
    turim = {"Yoreh De'ah": "YD", "Orach Chayim": "OC",
             "Even HaEzer": "EH", "Choshen Mishpat": "CM"}

    for name in ["Tur", "Beit Yosef", "Arukh HaShulchan", "Darkei Moshe", "Darchei Moshe"]:
        texts[f"{name}, Orach Chaim"] = [f"{name}, Orach Chayim", f"{name} OC"]
        texts[f"{name}, Yoreh Deah"] = [f"{name}, Yoreh De'ah", f"{name} YD"]
    for tur, abbre in turim.items():
        if abbre != "OC"and abbre != "YD":  # if not OC nor YD
            texts[f"Tur, {tur}"] = [f"Tur {tur}", f"Tur {abbre}"]
            texts[f"Beit Yosef, {tur}"] = [
                f"Beit Yosef {tur}", f"Beit Yosef {abbre}"]
            texts[f"Arukh HaShulchan, {tur}"] = [
                f"Arukh HaShulchan {abbre}"]
            texts[f"Darchei Moshe, {tur}"] = [
                f"Darchei Moshe {abbre}"]
            texts[f"Darkei Moshe, {tur}"] = [
                f"Darkei Moshe {abbre}"]
            texts[f"Shakh on Shulchan Arukh, {tur}"] = [f"Shakh {abbre}"]
    return render_template("/sefaria_asks.html", texts=OrderedDict(sorted(texts.items())))


if __name__ == "__main__":
    app.run(debug=True, development=True)
    format_page()
