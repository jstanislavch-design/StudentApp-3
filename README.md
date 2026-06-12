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

<img width="774" height="852" alt="Снимок экрана 2026-06-13 041834" src="https://github.com/user-attachments/assets/885c2e7b-7465-4ca2-b632-a9b9bde03dac" />
<img width="793" height="862" alt="Снимок экрана 2026-06-13 042140" src="https://github.com/user-attachments/assets/467d5a3e-675a-4f8d-ab3b-e4796541ab3f" />
<img width="1031" height="705" alt="Снимок экрана 2026-06-13 042123" src="https://github.com/user-attachments/assets/d3c33b44-a734-4188-b32e-45dba1a3fef0" />
<img width="1022" height="805" alt="Снимок экрана 2026-06-13 041920" src="https://github.com/user-attachments/assets/c436edba-e8c5-4b17-8207-9c2ee8c9784a" />
<img width="836" height="777" alt="Снимок экрана 2026-06-13 041859" src="https://github.com/user-attachments/assets/ff26045d-7200-49e6-8de7-e3a1426a5716" />
<img width="720" height="832" alt="Снимок экрана 2026-06-13 041851" src="https://github.com/user-attachments/assets/b0c23e54-5323-4130-a8ac-5a10ef4c1387" />
<img width="708" height="771" alt="Снимок экрана 2026-06-13 041842" src="https://github.com/user-attachments/assets/e0419b6b-7f5a-41c6-b9fb-73284b16e65c" />
