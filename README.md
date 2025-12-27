# Spring Boot Kotlin Demo

A simple Spring Boot application built with Kotlin.

## Requirements

- Java 21
- Gradle

## Running the Application

```bash
./gradlew bootRun
```

The application starts at `http://localhost:8080`.

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/`      | Returns a greeting message |

### Example

```bash
curl http://localhost:8080/
# Hello, World!

curl http://localhost:8080/?name=Spring
# Hello, Spring!
```

## Building

```bash
./gradlew build
```

## Testing

```bash
./gradlew test
```
