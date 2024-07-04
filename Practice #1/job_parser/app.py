from flask import Flask, request, render_template, redirect, url_for
from models import get_vacancies, save_vacancies_to_the_database, get_vacancies_with_filters
from db import __init__database

app = Flask(__name__)
__init__database()

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/fetch_vacancies')
def fetch_vacancies():
    vacancies = get_vacancies()
    if vacancies:
        save_vacancies_to_the_database(vacancies)
    return redirect(url_for('index'))

@app.route('/search', methods=['GET', 'POST'])
def search():
    filters = {}
    if request.method == 'POST':
        # Получаем запрос из формы
        search_query = request.form.get('search', '').strip()
        
        # Добавляем запрос в фильтры, если он существует
        if search_query:
            filters['name'] = search_query
        
        # Получаем дополнительные фильтры из формы
        filters.update({key: value for key, value in request.form.items() if key != 'search' and value})

        # Получаем вакансии с учетом фильтров
        vacancies = get_vacancies_with_filters(filters)
        return render_template('results.html', vacancies=vacancies, filters=filters)
    return render_template('results.html', vacancies=[], filters=filters)

if __name__ == '__main__':
    app.run(debug=True)