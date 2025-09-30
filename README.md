# lab1-back
написана на **Java 21** з використанням **Spring Boot**. Додаток реалізує веб-проєкт з 1 ендпоінтом (/healthcheck), який повертає дату звернення, з можливістю запуску як локально, так і в контейнері Docker.

## Локальний запуск

### Вимоги
Перед початком переконайтеся, що у вас встановлено:
- Java 21+
- Maven 3.9+
- Docker (опціонально, якщо запускатимете у контейнері)

### Клонування репозиторію
```bash
git clone https://github.com/DmytroHalai/lab1-back.git
cd lab1-back
```

### Запуск через Maven або IDE
1. Зберіть та запустіть застосунок командою:
   ```bash
   mvn spring-boot:run
   ```
   або відкрийте проєкт в IDE (IntelliJ IDEA, Eclipse) і запустіть клас Lab1BackApplication.

2. За замовчуванням сервер буде доступний на порту 8080:
   http://localhost:8080

### Запуск у Docker
1. Зберіть образ:
   ```bash
   docker build -t lab1-back .
   ```
2. Запустіть контейнер:
   ```bash
   docker run -p 8080:8080 lab1-back
   ```

### Запуск через Docker Compose
1. Виконайте:
   ```bash
   docker compose up --build
   ```
2. Після запуску додаток буде доступний на:
   http://localhost:8080

## Автор
Dmytro Halai
