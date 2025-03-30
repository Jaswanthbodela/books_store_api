# Bookstore REST API 

A Spring Boot-based REST API for managing books and users with JWT authentication, Dockerized PostgreSQL, and Swagger documentation. Built for simplicity and scalability.

---


## Prerequisites 🛠️

1. Java 17 JDK:  
   - Download from [Oracle JDK](https://www.oracle.com/java/technologies/downloads/#java17) or [OpenJDK](https://adoptium.net/).
   - Verify installation:  
     ```bash
     java -version
     ```

2. Docker Desktop:  
   - Required to run PostgreSQL.  
   - Install from [Docker Desktop](https://www.docker.com/products/docker-desktop/).  
   - Verify installation:  
     ```bash
     docker --version
     ```

3. Maven:  
   - Build tool for Java.  
   - Install from [Maven](https://maven.apache.org/download.cgi).  
   - Verify installation:  
     ```bash
     mvn -v
     ```

4. IDE (Optional):  
   - IntelliJ IDEA (recommended) or VS Code.
  

---
5.Set Env variables accordingly for Jdk, Maven, Springboot
## Installation 💻

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/bookstore-api.git
cd bookstore-api
```
2. Configure PostgreSQL with Docker
The project includes a docker-compose.yml file to start PostgreSQL automatically.

Start the database
```
docker-compose up -d postgres

````
  Verify the container is running:
```
docker ps

```

use the springboot as language and download the dependencies 
--Spring Data JPA
--Spring Web
--Validation
--PostGre SQL
--lombok
--JWT

Setup & Configuration ⚙️
1. Database Configuration
The database settings are pre-configured in src/main/resources/application.properties:

properties
Copy
spring.datasource.url=jdbc:postgresql://localhost:5432/bookstore
spring.datasource.username=admin
spring.datasource.password=password
Do not modify these unless you change the Docker setup.
````
Build the Project
Compile the code and resolve dependencies:
mvn clean install

````

3. IDE Setup (IntelliJ)
Open IntelliJ → File → Open → Select the project folder.

Wait for Maven dependencies to load (check the bottom-right progress bar).
Ensure Java 17 is set:

````
Running the Application
Run via Command Line
mvn spring-boot:run

````
Testing the API 🔍
1. Access Swagger UI
Open http://localhost:8080/swagger-ui/index.html in your browser.

Use the interactive UI to test endpoints.


````
Sample Requests
Sign Up (Create User)
curl -X POST "http://localhost:8080/api/auth/signup" \
-H "Content-Type: application/json" \
-d '{"email": "user@example.com", "password": "password123"}'

````
Due to time constraints, we have instilled a setup with 10 books and 2 dummy users, along with their reservations.

