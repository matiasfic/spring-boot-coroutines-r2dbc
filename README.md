# Spring Boot Kotlin Coroutines + R2DBC

Small example of a reactive Spring Boot application using Kotlin Coroutines
and R2DBC with a PostgreSQL database and Flyway for migrations.

### Requirements
Setup a local PostgreSQL database. 
```shell
docker run --name postgres -p 5432:5432 -e POSTGRES_USERNAME=username -e POSTGRES_PASSWORD=password -d postgres
```