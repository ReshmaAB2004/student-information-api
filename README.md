🎓 Student Information Management System

A Spring Boot–based Student Information Management System that provides both a browser-based UI and REST APIs to manage student records.

✨ Features

Add, view, update, and delete students

UI using Thymeleaf

REST APIs tested with Postman

Clean layered architecture

Global exception handling

MySQL database integration

🛠️ Tech Stack

Java

Spring Boot

Spring Data JPA

Thymeleaf

MySQL

Postman

▶️ Run the Project

Create database:

CREATE DATABASE student_db;


Update application.properties with DB credentials

Run:

mvn spring-boot:run

🌐 Access

UI: http://localhost:8080/students

API: http://localhost:8080/api/students

📮 API Endpoints
Method	Endpoint
POST	/api/students
GET	/api/students
GET	/api/students/{id}
PUT	/api/students/{id}
DELETE	/api/students/{id}
