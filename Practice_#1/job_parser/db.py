import psycopg2
from psycopg2 import sql
from config import Config
import logging
import time

# Реализуем подключение к базе данных PostgreSQL
def connect_to_the_database():
    retries = 5
    while retries > 0:
        try:
            connection_ = psycopg2.connect(
                dbname = Config.dbname,
                user = Config.user,
                password = Config.password,
                host = Config.host,
                port = Config.port
            )
            return connection_
        except psycopg2.Error as error:
            retries -= 1
            time.sleep(5)
    raise Exception('Невозможно подключиться к базе данных')

def __init__database():
    connection_ = connect_to_the_database()
    if connection_:
        cursor_ = connection_.cursor() # создание курсора
        cursor_.execute('''
            CREATE TABLE IF NOT EXISTS vacancies (
                id integer NOT NULL,
                name text NOT NULL,
                alternate_url character varying(200) NOT NULL,
                employer text NOT NULL,
                snippet text,
                schedule text,
                experience text,
                employment text,
                salary text
            )
        ''')
        connection_.commit() # сохранение изменений
        cursor_.close()
        connection_.close()
        logging.info('Инициализация базы данных завершена')
    else:
        logging.error('Ошибка инициализации базы данных')