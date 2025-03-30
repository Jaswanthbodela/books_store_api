Bookstore REST API Overview
This is a Spring Boot-based API built to handle the management of books and users. It includes JWT authentication, a Dockerized PostgreSQL database, and Swagger documentation for easy API interaction.

Prerequisites 
Java 17 JDK:

Download from Oracle JDK or OpenJDK.

To confirm Java is installed, run:


java -version
Docker Desktop:

Docker is required to run the PostgreSQL database.

Get Docker from Docker Desktop.

To verify Docker installation, run:

docker --version
Maven:

Maven is needed as the Java build tool.

Install from Maven.

Confirm Maven installation with:

mvn -v
IDE (Optional):

Recommended IDEs are IntelliJ IDEA or Visual Studio Code.

Environment Setup:

Ensure your environment variables for JDK, Maven, and Spring Boot are properly configured.

Installation Steps 💻
1. Clone the Repository:
First, clone the repository and navigate to the project folder by executing:

git clone https://github.com/jaswanthbodela/bookstore-api.git
cd bookstore-api
2. Set Up PostgreSQL with Docker:
This project includes a docker-compose.yml file that allows you to start PostgreSQL quickly.

Start the PostgreSQL container with:


docker-compose up -d postgres
To ensure the container is running, check with:


docker ps
Make sure you download the required Spring Boot dependencies, which include:

Spring Data JPA

Spring Web

Validation

PostgreSQL

Lombok

JWT

Configuration 
1. Database Settings:
The database connection details are pre-set in the src/main/resources/application.properties file:

properties
Copy
spring.datasource.url=jdbc:postgresql://localhost:5432/bookstore
spring.datasource.username=admin
spring.datasource.password=password
Change these only if you’ve modified your Docker configuration.

2. Build the Application:
To compile and resolve dependencies, use the following Maven command:


mvn clean install
Setting Up in IntelliJ IDEA:
Open IntelliJ IDEA, click File → Open, and select the project directory.

Wait for Maven to load dependencies (you’ll see progress in the bottom-right).

Make sure the Java 17 SDK is selected for the project.

Running the Application:
You can start the Spring Boot application from the command line using:

mvn spring-boot:run
