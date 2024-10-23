## Weather Monitoring Backend

This backend API is part of the Weather Monitoring Application. 
It stores and retrieves temperature data (minimum, maximum, and average temperatures) for various cities.
The backend is built using Spring Boot and MongoDB.

## Technologies Used
- **Java 17**
- **Spring Boot**
- **MongoDB**
- **Maven 3.2**

## Configuration

The application connects to a MongoDB instance running on localhost using the following configuration:

**In application properties:-**
spring.application.name=weatherApp

spring.data.mongodb.host=localhost

spring.data.mongodb.port=27017

spring.data.mongodb.database=weatherdb


**Running the Application**

Clone the repository:**git clone https://github.com/sanjay0606/weather-monitoring-app-backend.git**

**Build the project using Maven:** mvn clean install

**Run the application:** mvn spring-boot:run

The application will start and be accessible on **http://localhost:8080.**

**BASE_URL : http://localhost:8080/api/temperature**

**Dependencies**

The project relies on the following dependencies:

<dependencies>
  
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-mongodb</artifactId>
	</dependency>

  
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
	<dependency>

 
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-test</artifactId>
		<scope>test</scope>
	</dependency>
 
</dependencies>
