Описание
Простое REST API для управления книгами. Проект предоставляет возможности добавления, получения, обновления и удаления книг. Реализовано с использованием Spring Boot и встроенной базы данных H2.

Функциональность
POST /api/books — Добавить книгу.
GET /api/books — Получить список всех книг.
GET /api/books/{id} — Получить информацию о книге по ID.
PUT /api/books/{id} — Обновить информацию о книге.
DELETE /api/books/{id} — Удалить книгу.
Как запустить проект
1. Требования
Java 11 или выше
Maven
2. Установка и запуск
1 Склонируйте репозиторий:
 git clone https://github.com/ваш-юзернейм/book-api.git
2 Перейдите в директорию проекта:
cd book-api
3 Соберите проект с помощью Maven:
mvn clean install
4 Запустите приложение:
mvn spring-boot:run

Приложение запустится на порту 8080. Теперь можно использовать Postman или curl для отправки HTTP-запросов к API.

3. Доступ к базе данных H2
Для доступа к консоли H2 можно перейти по адресу:


http://localhost:8080/h2-console
По умолчанию:

JDBC URL: jdbc:h2:mem:booksdb
Имя пользователя: sa
Пароль: password
Примеры запросов
1. Добавление книги

POST /api/books
Content-Type: application/json

{
  "title": "Java Programming",
  "author": "John Doe",
  "isbn": "123-456-789",
  "publishedYear": 2020
}
2. Получение всех книг

GET /api/books
3. Обновление книги

PUT /api/books/1
Content-Type: application/json

{
  "title": "Advanced Java",
  "author": "Jane Doe",
  "isbn": "987-654-321",
  "publishedYear": 2021
}
4. Удаление книги
DELETE /api/books/1
Документация API
Для просмотра документации можно использовать Swagger. После запуска приложения перейдите по адресу:
http://localhost:8080/swagger-ui.html
