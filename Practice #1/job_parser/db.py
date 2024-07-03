import psycopg2
from psycopg2 import sql
from config import Config

# Реализуем подключение к базе данных PostgreSQL
def connect_to_the_database():
    connection_ = psycopg2.connect(
        dbname = Config.dbname,
        user = Config.user,
        password = Config.password,
        host = Config.host,
        port = Config.port
    )
    return connection_

def __init__database():
    connection_ = connect_to_the_database()
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