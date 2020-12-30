import os

import redis
from rq import Worker, Queue, Connection

listen = ['high', 'default', 'low']

redis_url = "redis://redistogo:4a34bb7c5d2314caefe22c724a4cc7b8@scat.redistogo.com:10966/"
conn = redis.from_url(redis_url)

if __name__ == '__main__':
    with Connection(conn):
        worker = Worker(map(Queue, listen))
        worker.work()
