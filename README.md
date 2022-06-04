# ExchangeRates
Consume external services using Feign client in Spring Boot

Java version: 11

Запуск приложения с портом по умолчанию 8080
--------------------------------------------
java -jar ExchangeRates-0.0.1-SNAPSHOT.jar

Доступ к приложению для порта 8080: http://localhost:8080

Запуск приложения с указанием определённого порта
-------------------------------------------------

java -jar ExchangeRates-0.0.1-SNAPSHOT.jar --server.port=80

Доступ к приложению для порта 80: http://localhost

Создание контейнера приложения в Docker.
-
Находясь в корневой директории проекта (где находится файл Dockerfile), выполнить команду (точка в конце ОБЯЗАТЕЛЬНА):

docker build -t exchange-rates .

Запуск контейнера в attached mode:
docker run -p 8080:8080 exchange-rates

Доступ к приложению для порта 8080: http://localhost:8080

Запуск контейнера в detached mode:
docker run -dp 80:8080 exchange-rates

Доступ к приложению для порта 80: http://localhost

Получить готовый контейнер с https://hub.docker.com:
-
docker pull sergeysangalov/exchange-rates:latest

Запуск контейнера:

docker run -p 8080:8080 --name exchange-rates sergeysangalov/exchange-rates:latest
