# Student App — REST API

REST API для управления студентами, созданный на **Spring Boot**.
Поддерживает полный набор CRUD-операций (создание, чтение, обновление, удаление).

## Технологии

- Java
- Spring Boot
- Spring Data JPA
- База данных (PostgreSQL / H2)
- Maven

## Возможности (CRUD)

| Метод | Endpoint | Описание |
|-------|----------|----------|
| `GET` | `/api/students` | Получить всех студентов |
| `GET` | `/api/students/{id}` | Получить студента по ID |
| `POST` | `/api/students` | Создать нового студента |
| `PUT` | `/api/students/{id}` | Обновить данные студента |
| `DELETE` | `/api/students/{id}` | Удалить студента |

## Пример тела запроса (POST / PUT)

```json
{
  "name": "Артур",
  "age": 21,
  "grade": 4.5
}

