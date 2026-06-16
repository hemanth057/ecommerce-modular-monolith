# E-Commerce Modular Monolith Backend

Spring Boot backend project using modular monolith architecture.

## Technologies Used

- Java 21
- Spring Boot 3
- Spring Security
- JWT Authentication
- MongoDB
- Maven
- Postman

## Modules

### Authentication Module
- User Registration
- User Login
- BCrypt Password Encryption
- JWT Token Generation
- JWT Validation

### Product Module
- Create Product
- Get Products
- Update Product
- Delete Product

### Order Module
- Create Order
- Get Orders

### Payment Module
- Process Payment
- Get Payments

### Notification Module
- Create Notification
- Get Notifications

## Security Flow

User Login
↓
JWT Token Generated
↓
Bearer Token
↓
JWT Filter
↓
Spring Security Context
↓
Protected APIs


## Database

MongoDB Database:

ecommerce_db

Collections:

- users
- products
- orders
- payments
- notifications


## Run Application

```bash
mvn spring-boot:run