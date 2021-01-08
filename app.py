from flask import Flask, request, render_template, url_for, jsonify, abort
import worker
import rq
import tempfile
import time
import os
import re
from flask_restx import inputs
from static.CASClient import CASClient

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


@app.route('/italicized-words')
def italicized_words():
    with open("AutoCorrect.java") as ac:
        lines = ac.read().split(";\n")

    words = []
    for line in lines:
        in_line = line.split(" ")
        for i in range(len(in_line)):
            word = in_line[i]
            if word == "italicizedArr":
                words = new_func(in_line, i)
    return render_template("italicized_pages.html", italicized=words)


def new_func(line, start):
    words = []
    for word in line[start+3:-1]:
        if not word:
            continue
        if "\"" in word:
            words.append(word.split("\"")[1])
        else:
            words.append(format_words(word.split(",")[0]))
    return words


def format_words(end):
    # if end.isupper():
    #     end = end.lower()
    words = end.split("___")
    return format_word(" ".join(words)).replace("_", "'")


def format_word(end):
    compounds = end.split("__")
    if len(compounds) == 1:
        return end.lower()
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
    if compounds[1] == "ha'titlecase":
        return "Ha" + compounds[0][2:].title()
    return " ".join(compounds)


if __name__ == "__main__":
    app.run(debug=True, development=True)
    # format_page()
    italicized_words()
