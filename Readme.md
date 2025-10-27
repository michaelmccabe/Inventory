# Inventory Service Microservice Template

This project serves as a template for building well-structured, production-ready microservices in Java using the Spring Boot framework. It provides a solid foundation with a clear project structure, robust testing facilities, and best practices for modern Java development.

## Core Technologies

*   **Java 21**
*   **Spring Boot 3:** For building the application.
*   **Spring Data JPA:** For data persistence.
*   **PostgreSQL:** As the relational database.
*   **Maven:** For dependency management and build automation.
*   **Lombok:** To reduce boilerplate code.

## Project Structure

The project follows a standard Maven layout:

*   `src/main/java`: Main application source code.
*   `src/main/resources`: Application configuration, static assets, and database migrations.
*   `src/test/java`: Test source code.
*   `src/test/resources`: Test-specific configuration.
*   `pom.xml`: Maven project configuration.

## API Definition

The API is defined using the OpenAPI 3.0 specification.

*   The definition file is located at `src/main/resources/openapi.yaml`.
*   The `openapi-generator-maven-plugin` is used to generate the API interfaces and model classes (`com.mictech.api` and `com.mictech.api.model`) during the `generate-sources` phase of the Maven build. This ensures the implementation stays in sync with the API contract.

## Database Migrations

Database schema changes are managed using **Flyway**.

*   SQL migration scripts are placed in `src/main/resources/db/migration`.
*   Flyway automatically applies these migrations to the database on application startup, ensuring the schema is always up-to-date.

## Testing Facilities

This template is configured with a comprehensive testing strategy that includes both unit and integration tests.

*   **JUnit 5:** The standard testing framework for Java.
*   **Testcontainers:** This is a key feature of the template. For integration testing, Testcontainers is used to spin up a real PostgreSQL database inside a Docker container.
    *   This allows tests to run against a live, ephemeral database, providing a high degree of confidence that the application will behave correctly in a production-like environment.
    *   An example integration test, `ItemControllerIntegrationTest`, demonstrates how to set up and use the Testcontainer for testing controller endpoints and their interaction with the database layer.
*   **Test-specific Properties:** A separate configuration file at `src/test/resources/application-test.properties` is used to configure the application context for the testing environment, such as setting the datasource URL to point to the Testcontainer.
