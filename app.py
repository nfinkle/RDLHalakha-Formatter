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


if __name__ == "__main__":
    app.run(debug=True, development=True)
    format_page()
