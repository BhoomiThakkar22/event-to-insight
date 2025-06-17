# Event-to-Insight System

## 🚀 Overview

The **Event-to-Insight** platform helps IT support teams quickly prioritize and categorize incoming incident reports. It uses simple AI logic to predict severity and category, and displays this information in a web-based dashboard.

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot 3.x
- Spring MVC + Thymeleaf
- Spring Data JPA (Hibernate)
- H2 Database (in-memory)
- SLF4J + Logback for logging

---

## 📦 Features

- Web UI to input incident reports
- AI-predicted severity & category using keyword matching
- Dashboard to view all incidents
- Clean architecture using DTOs and services
- Logging included for observability

---


2. Run Using Maven
mvn spring-boot:run


3. Access Dashboard
Open your browser and navigate to:
http://localhost:8080/
