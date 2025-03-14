# BookingApplication
![My Photo](./photo.png)

## Project Description
Imagine a booking service in your area, offering individuals the opportunity to rent homes, apartments, and other accommodations for their chosen duration. Currently, this service faces significant operational challenges due to antiquated, manual processes for managing properties, renters, financial transactions, and booking records. Our project addresses these issues by creating an efficient online platform for managing housing rentals, transforming the way people experience accommodation booking.

## Technologies
Here's a breakdown of the main technologies used in this project:

### Frameworks and Libraries
- **Spring Boot**: Framework for building Java-based applications. It provides a comprehensive set of tools for building RESTful APIs, integrating with databases, and more.
- **Spring Data JPA**: Allows for seamless interaction with relational databases using JPA (Java Persistence API).
- **Spring Security**: Provides authentication and authorization capabilities, with JWT support.
- **Springdoc OpenAPI**: Offers OpenAPI (Swagger) documentation for your RESTful APIs.

### Database and ORM
- **PostgreSQL**: The primary database for storing booking information, user data, and other details.
- **Liquibase**: A tool for managing database migrations and version control for schema changes.
- **MapStruct**: A mapping framework for converting between data objects and DTOs.

### Testing
- **JUnit**: The primary testing framework.
- **Testcontainers**: Allows for integration testing with real database instances.
- **Mockito**: Provides support for mocking dependencies in tests.

### Messaging and Integration
- **Telegram Bots**: Integration with Telegram for automated messaging and notifications.
- **Stripe**: A platform for handling online payments and transactions.

### Utilities
- **Lombok**: Helps reduce boilerplate code for entity classes and more.
- **Checkstyle**: A tool to ensure code style consistency.
- **Docker Compose**: Facilitates running multiple Docker containers for development and testing.

## Project Structure
The project follows the standard Spring Boot structure with controllers, services, and repositories. The `src` directory contains the source code, and the `test` directory includes test cases.

## Setup
To set up and run the project locally, follow these steps:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/RCherniavskiy/BookingApplication.git
   cd booking-application
   ```
2. **Ensure you have Java 17 installed.**
3. **Ensure you have Maven installed.**
4. **Ensure you have Docker installed.**
5. **Update the database configuration in the `.env` file.**
6. **Build the project using Maven:**
   ```bash
   mvn clean package
   ```
7. **Build the image using Docker:**
   ```bash
   docker compose build
   ```
8. **Run the application using Docker:**
   ```bash
   docker-compose up
   ```

## Example .env
```yaml
###PostgreSQL###
POSTGRES_USER=postgres
POSTGRES_PASSWORD=password
POSTGRES_DATABASE=test
POSTGRES_LOCAL_PORT=5434
POSTGRES_DOCKER_PORT=5432

###DOCKER###
SPRING_LOCAL_PORT=8081
SPRING_DOCKER_PORT=8080
DEBUG_PORT=5005

###JWT###
JWT_SECRET=helloworldIamfromdifferentcitybutiwanttoliveinnirvana
JWT_EXPIRATIONS=3600000

###STRIPE_SECRET_KEY###
STRIPE_SECRET_KEY=
STRIPE_CANCEL_URL=http://localhost:8081/payments/cancel/{CHECKOUT_SESSION_ID}
STRIPE_SUCCESS_URL=http://localhost:8081/payments/success/{CHECKOUT_SESSION_ID}

###TELEGRAM###
BOT_NAME=
BOT_TOKEN=
TELEGRAM_SECRET=helloworld123bye
```

## For use
1. **User 1:**
    - **Email:** adm@i.com
    - **Password:** admADM200@
    - **Authorities:**
        - ADMIN
        - CUSTOMER

2. **User 2:**
    - **Email:** usr@i.com
    - **Password:** admADM200@
    - **Authorities:**
        - CUSTOMER

## Postman Collection
For a quick start, use the provided [Postman collection](https://www.postman.com/lunar-comet-638867/workspace/booking-application/collection/33014096-f9d163a4-d04f-4f07-b7d1-402d0bd090a7?action=share&creator=33014096) to test the API endpoints. Import the collection into Postman and follow the included documentation.

## Acknowledgments
Special thanks to the Spring Boot community and the contributors to the libraries and tools used in this project. Your dedication and expertise make projects like these possible.

Feel free to explore, contribute, and provide feedback. Happy coding!

