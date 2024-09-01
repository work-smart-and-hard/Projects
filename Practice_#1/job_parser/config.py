import os

class Config:
    dbname = os.environ.get("POSTGRES_DB")
    user = os.environ.get("POSTGRES_USER")
    password = os.environ.get("POSTGRES_PASSWORD")
    host = "db" # Имя сервиса базы данных в docker-compose.yml
    port = "5432"