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





## 📡 API Endpoints

### Authentication

#### Register User
```http
POST /api/auth/register
```

Request:
```json
{
  "username":"hemanth",
  "email":"hemanth@gmail.com",
  "password":"12345"
}
```

---

#### Login User
```http
POST /api/auth/login
```

Request:
```json
{
  "email":"hemanth@gmail.com",
  "password":"12345"
}
```

Response:
```text
JWT Token
```

---

### Products

#### Get Products

```http
GET /api/products
```

Authorization:

```text
Bearer JWT_TOKEN
```


### Orders

```http
POST /api/orders
```

Creates customer order.


### Payments

```http
POST /api/payments
```

Processes payment.


### Notifications

```http
GET /api/notifications
```

Fetch notifications.
