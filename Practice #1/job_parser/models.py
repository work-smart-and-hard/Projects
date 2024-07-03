import requests
from config import Config
from db import connect_to_the_database

# получение вакансий
def get_vacancies(): 
    url = 'https://api.hh.ru/vacancies'
    response = requests.get(url)
    if response.status_code == 200:
        return response.json()
    else:
        print(f'Ошибка данных: {response.status_code}')

# Сохранение полученных вакансий в базу данных PostgreSQL
def save_vacancies_to_the_database(vacancies):
    connection_ = connect_to_the_database()
    cursor_ = connection_.cursor() # создание курсора
    query = sql.SQL('''
        INSERT INTO vacancies (id, name, alternate_url, employer, snippet, schedule, experience, employment, salary) 
        VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s)
    ''')
    for vacancy in vacancies["items"]:
        salary_info = vacancy.get("salary")
        if salary_info:
            salary_value = f'{salary_info.get("from", "")} - {salary_info.get("to", "")} {salary_info.get("currency", "")}'
        else:
            salary_value = 'Заработная плата не указана'
        data = (
            vacancy["id"],
            vacancy["name"],
            vacancy["alternate_url"],
            vacancy["employer"]["name"],
            vacancy["snippet"]["requirement"],
            vacancy["schedule"]["name"],
            vacancy["experience"]["name"],
            vacancy["employment"]["name"],               
            salary_value
        )
        cursor_.execute(query, data) # выполнение запроса
    connection_.commit() # сохранение изменений
    cursor_.close()
    connection_.close()

# Добавление фильтров в базу данных PostgreSQL
def get_vacancies_with_filters(filters):
        connection_ = connect_to_the_database()
        cursor_ = connection_.cursor() # создание курсора
        # Построение запроса с фильтрацией
        query = f'SELECT * FROM vacancies'
        conditions, values = [], []
        if filters:
            for column, value in filters.items():
                conditions.append(f'{column} LIKE %s')
                values.append(f'%{value}%')
            if conditions:
                query += ' WHERE ' + ' AND '.join(conditions)
        cursor_.execute(query, values) # выполнение запроса
        results = cursor_.fetchall() # получение результатов
        cursor_.close()
        connection_.close()
        return results