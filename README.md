# Authentication-and-Authorization

# Authentication and Authorization using JWT

![JWT Authentication Banner](./images/authentication_banner.png)

## 🛡️ Project Overview

This project demonstrates a secure **Authentication and Authorization** system using **JSON Web Tokens (JWT)** without relying on a database. User data is stored in memory for simplicity, making it ideal for learning or small-scale applications.

---

## 🚀 Features

- **User Registration**: Store user credentials securely in memory.
- **User Login**: Authenticate users and issue JWT tokens.
- **Access Protected Routes**: Validate JWT tokens to access API endpoints.
- **Role-Based Authorization**: Restrict access to routes based on roles (e.g., admin, user).
- **Logout**: Invalidate JWT tokens locally on the client side.

---

## 🛠️ Technologies Used

- **Backend**: Spring Boot / Express.js (Node.js)
- **Security**: JWT, BCrypt (for password hashing)
- **Frontend**: React / Angular / Postman (for API testing)

---

## 📦 Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/auth-jwt-no-db.git
   cd auth-jwt-no-db
