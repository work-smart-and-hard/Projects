# Используем официальный образ Python в качестве базового образа
FROM python:3.9
# Устанавливаем необходимые пакеты
RUN apt-get update && apt-get install -y \
    postgresql-client
# Устанавливаем рабочую директорию в контейнере
WORKDIR /app
# Копируем файл с зависимостями в контейнер
COPY requirements.txt .
# Устанавливаем зависимости
RUN pip install --no-cache-dir -r requirements.txt
# Копируем все файлы в рабочую директорию
COPY . .
# Устанавливаем переменные окружения для Flask
ENV FLASK_APP=app.py
ENV FLASK_RUN_HOST=0.0.0.0
# Открываем порт 5000 для доступа к Flask приложению
EXPOSE 5000
# Запускаем приложение
CMD ["python", "app.py"]