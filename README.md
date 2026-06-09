# 📚 Library Management System - Spring Boot Edition - PostgreSQL - Scaled from OOP project

[![Java](https://img.shields.io/badge/Java-17%2B-orange?style=flat-square&logo=java)](https://www.java.com)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.0-brightgreen?style=flat-square&logo=spring-boot)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15%2B-blue?style=flat-square&logo=postgresql)](https://www.postgresql.org)
[![Maven](https://img.shields.io/badge/Maven-3.8%2B-C71A36?style=flat-square&logo=apache-maven)](https://maven.apache.org)
[![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)](LICENSE)

---
(!!!PROJECT WILL BE EDITED, as well as this file.
Some information in this guide is not yet implemented in the project codebase and serves as a development roadmap!!!)
## 🚀 Project Overview

A **production-ready REST API** for library management, evolved from the original console-based OOP project. This enterprise-grade application demonstrates the journey from core Java fundamentals to modern Spring Boot architecture with relational database persistence.

### 🎯 What This Project Showcases

| Aspect | Original Project | Spring Boot Version |
|--------|------------------|-------------------|
| **Architecture** | Layered Console App | Microservices-Ready REST API |
| **Build Tool** | Gradle | Maven |
| **Database** | In-Memory (Collections) | PostgreSQL with JPA/Hibernate |
| **API** | Console Input/Output | RESTful JSON API |
| **Scalability** | Limited | Enterprise-Ready |
| **Testing** | Manual | Unit & Integration Tests |
| **Deployment** | JAR File | Docker-Ready |

---

## ✨ Features

### Core Functionality
- 📖 **Book Management** - Add, update, delete, and retrieve books
- 👥 **User Management** - Register and manage library members
- 🔄 **Borrowing System** - Lend books and track return dates
- 📊 **Inventory Tracking** - Real-time book availability status
- 📅 **Borrow Records** - Complete audit trail of all transactions

### Advanced Features
- 🔐 **Data Validation** - Input validation at service and API layers
- 📝 **Error Handling** - Comprehensive error responses with meaningful messages
- 🔍 **Search & Filter** - Query books by title, author, ISBN
- 📈 **Pagination** - Handle large datasets efficiently
- 🗂️ **Entity Relationships** - One-to-Many and Many-to-One associations

---

## 🏗️ System Architecture

```
┌─────────────────────────────────────────────────────┐
│           REST API Layer (Controllers)              │
│   /api/books  /api/users  /api/borrow_records       │
└──────────────────┬──────────────────────────────────┘
                   │
┌──────────────────▼──────────────────────────────────┐
│         Business Logic Layer (Services)             │
│  BookService  UserService  BorrowService            │
└──────────────────┬──────────────────────────────────┘
                   │
┌──────────────────▼──────────────────────────────────┐
│    Data Access Layer (Repositories & JPA)           │
│  BookRepository  UserRepository  BorrowRepository   │
└──────────────────┬──────────────────────────────────┘
                   │
┌──────────────────▼──────────────────────────────────┐
│      Database Layer (PostgreSQL with Hibernate)     │
│         Persistence & Transaction Management        │
└─────────────────────────────────────────────────────┘
```

---

## 🧠 OOP & Design Patterns Implemented

### Core OOP Principles
- ✅ **Encapsulation** - Private fields with getters/setters
- ✅ **Abstraction** - Abstract interfaces and services
- ✅ **Inheritance** - Entity hierarchy with JPA inheritance
- ✅ **Polymorphism** - Interface implementation and method overriding

### Design Patterns
- 🏗️ **Repository Pattern** - Data access abstraction
- 🔧 **Dependency Injection** - Spring IoC container
- 📝 **DTO Pattern** - Data Transfer Objects for API responses
- 🏭 **Factory Pattern** - Entity creation and instantiation
- 🔗 **Proxy Pattern** - JPA lazy loading

---

## 📦 Tech Stack

### Backend
- **Framework:** Spring Boot 3.3.0
- **Language:** Java 17+
- **Build Tool:** Maven 3.8+
- **ORM:** Hibernate + JPA
- **Database:** PostgreSQL 15+
- **API:** REST with JSON

### Development & Tools
### Currently Using:
- **IDE:** IntelliJ IDEA

### Planned/To Be Added:
- Testing: JUnit 5 + Mockito (planned)
- Documentation: Swagger (planned)
- JavaDoc comments (planned)
---

## 📂 Project Structure

```
library-management-system-springboot/
│
├── src/main/java/com/alasherdev08/
│   ├── LibraryManagementSystemApplication.java    # Main Boot Application
│   │
│   ├── controller/                          # REST Controllers
│   │   ├── BookController.java
│   │   ├── UserController.java
│   │   └── BorrowController.java
│   │
│   ├── service/                             # Business Logic
│   │   ├── BookService.java
│   │   ├── UserService.java
│   │   └── BorrowService.java
│   │
│   ├── repository/                          # Data Access (JPA)
│   │   ├── BookRepository.java
│   │   ├── UserRepository.java
│   │   └── BorrowRepository.java
│   │
│   ├── entity/                              # JPA Entities
│   │   ├── Book.java
│   │   ├── User.java
│   │   └── BorrowRecord.java
│   │
│   ├── dto/ (to be added)                                # Data Transfer Objects
│   │   ├── BookDTO.java
│   │   ├── UserDTO.java
│   │   └── BorrowDTO.java
│   │
│   ├── exception/ (to be added)                           # Custom Exceptions
│   │   ├── ResourceNotFoundException.java
│   │   └── ValidationException.java
│   │
│   └── config/ (to be added)                              # Configuration Classes
│       └── DatabaseConfig.java
│
├── src/main/resources/
│   ├── application.properties               # Configuration
│   ├── application-dev.properties
│   └── application-prod.properties
│
├── src/test/java/                           # Unit & Integration Tests
│
├── pom.xml                                  # Maven Dependencies
├── README.md                                # This file
└── .gitignore
```

---

## 🚀 Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- **Java 17 or higher**
  ```bash
  java --version
  ```

- **Maven 3.8+**
  ```bash
  mvn --version
  ```

- **PostgreSQL 15+**
  ```bash
  psql --version
  ```

- **Git**

### Installation & Setup

#### 1️⃣ Clone the Repository

```bash
git clone https://github.com/alisherdev08/library-management-system-v2.git
cd library-management-system-v2
```

#### 2️⃣ Create PostgreSQL Database

```bash
# Connect to PostgreSQL
psql -U postgres

# Create database
CREATE DATABASE library_management_system;

# Create user (optional, for security)
CREATE USER library_user WITH PASSWORD 'secure_password';
ALTER ROLE library_user SET client_encoding TO 'utf8';
ALTER ROLE library_user SET default_transaction_isolation TO 'read committed';
ALTER ROLE library_user SET default_transaction_deferrable TO on;
GRANT ALL PRIVILEGES ON DATABASE library_management_system TO library_user;

# Exit
\q
```

#### 3️⃣ Configure Application yaml

Edit `src/main/resources/application.yaml`:

```yaml
# Server Configuration
server:
port: 8080
servlet:
context-path: /api

# PostgreSQL Database Configuration
spring:
datasource:
url: jdbc:postgresql://localhost:5432/library_management
username: postgres
password: your_password
driver-class-name: org.postgresql.Driver

# JPA/Hibernate Configuration
jpa:
database-platform: org.hibernate.dialect.PostgreSQLDialect
ddl-auto: update
show-sql: false
properties:
hibernate:
format_sql: true

# Application Name
application:
name: LibraryManagementSystem

# Logging
logging:
  level:
    root: WARN                    
    com:
      alisherdev08: DEBUG        
    org.springframework: INFO                                          
    org.hibernate: DEBUG  
```

#### 4️⃣ Build & Run

```bash
# Clean and build
mvn clean install

# Run the application
mvn spring-boot:run

# Or run as JAR
java -jar target/LibraryManagementSystem-0.0.1-SNAPSHOT.jar
```

✅ Server runs on: `http://localhost:8080/api`

---

## 📡 API Documentation

### Base URL
```
http://localhost:8080/api
```

### 📖 Books Endpoints

#### Get All Books
```http
GET /books
```

**Response (200 OK):**
```json
[
  {
    "id": 1,
    "title": "Clean Code",
    "author": "Robert C. Martin",
    "isbn": "978-0132350884",
    "available": true,
    "createdAt": "2024-06-07T10:30:00"
  }
]
```

#### Get Book by ID
```http
GET /books/{id}
```

**Example:**
```http
GET /books/1
```

#### Create New Book
```http
POST /books
Content-Type: application/json

{
  "title": "Design Patterns",
  "author": "Gang of Four",
  "isbn": "978-0201633610",
  "available": true
}
```

**Response (201 Created):**
```json
{
  "id": 2,
  "title": "Design Patterns",
  "author": "Gang of Four",
  "isbn": "978-0201633610",
  "available": true
}
```

#### Update Book
```http
PUT /books/{id}
Content-Type: application/json

{
  "title": "Design Patterns (Updated)",
  "author": "Gang of Four",
  "isbn": "978-0201633610",
  "available": false
}
```

#### Delete Book
```http
DELETE /books/{id}
```

**Response (204 No Content)**

---

### 👥 Student Endpoints

#### Get All Students
```http
GET /students
```

#### Get Student by ID
```http
GET /students/{id}
```

#### Create Student
```http
POST /students
Content-Type: application/json

{
  "name": "Ahmed Alisher",
  "email": "ahmed@example.com",
  "phone": "+998901234567"
}
```

#### Update Student
```http
PUT /students/{id}
Content-Type: application/json

{
  "name": "Ahmed Alisher Updated",
  "email": "ahmed.new@example.com",
  "phone": "+998909876543"
}
```

#### Delete Student
```http
DELETE /students/{id}
```

---

### 🔄 Borrowing Endpoints

#### Borrow a Book
```http
POST /borrow_records
Content-Type: application/json

{
  "userId": 1,
  "bookId": 1,
  "borrowDate": "2024-06-07",
  "returnDate": "2024-06-21"
}
```

#### Return Book
```http
PUT /borrow_records/{id}/return
```

#### Get Borrow History
```http
GET /borrow_records/user/{userId}
```

#### Get Overdue Books
```http
GET /borrow_records/overdue
```

---

## 🧪 Testing

### Run All Tests
```bash
mvn test
```

### Run Specific Test Class
```bash
mvn test -Dtest=BookServiceTest
```

### Run with Coverage
```bash
mvn test jacoco:report
```

---



## 📚 Learning Outcomes

### From Original OOP Project to Spring Boot
- ✅ Advanced OOP concepts (Inheritance, Polymorphism)
- ✅ Relational database design and SQL
- ✅ Spring Framework internals and dependency injection
- ✅ REST API design principles
- ✅ JPA/Hibernate ORM mapping
- ✅ Maven project management
- ✅ Layered architecture patterns
- ✅ Error handling and validation
- ✅ API versioning strategies
- ✅ Deployment and DevOps basics

---

## 🔗 Related Projects

- **Original Project:** [Library Management System (OOP)](https://github.com/alasherdev08/library-management-system)
    - Pure Java console application
    - Core OOP concepts practice

---

## 🚦 Development Roadmap

- [x] Basic CRUD operations
- [x] PostgreSQL integration
- [x] REST API structure
- [ ] JWT Authentication
- [ ] Role-based access control
- [ ] Advanced search and filtering
- [ ] API documentation (Swagger/OpenAPI)
- [ ] Unit and integration tests
- [ ] Docker containerization
- [ ] CI/CD pipeline (GitHub Actions)

---

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Author

### **Alisher** | Java Backend Developer

🔗 **Links:**
- GitHub: [@alisherdev08](https://github.com/alisherdev08)
- Email: githubalisherka@gmail.com

---

## 📞 Support

If you encounter any issues or have questions:

1. Check the [GitHub Issues](https://github.com/alasherdev08/library-management-system-springboot/issues)
2. Review the API documentation above
3. Check application logs for errors
4. Create a new issue with detailed description

---

## 🎓 Educational Resources

Used in learning:
- Spring Boot Official Documentation
- Spring Data JPA Guide
- PostgreSQL Documentation
- REST API Best Practices
- Clean Code & Design Patterns

---

**⭐ If you find this project helpful, please star it!**

Last Updated: ********************