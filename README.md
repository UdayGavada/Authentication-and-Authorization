<div align="center">
   
   ## Authentication and Authorization using JWT
</div>
<div align="center">
   
![rm373batch4-15](https://github.com/user-attachments/assets/40a8979a-0072-4172-a0db-b61b7aad7457)
</div>

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

- **Backend**: Spring Boot.
- **Security**: JWT, BCrypt (for password hashing)
- **Frontend**: Postman (for API testing)

---

## 📦 Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/UdayGavada/Authentication-and-Authorization.git
   cd auth-jwt-no-db
2. Maven Installation
   ```bash
   mvn install
3. JWT AUTH_KEY
   ```bash
   JWT_SECRET=your_jwt_secret
   

## OUTPUT


<table>
  <tr>
    <td><strong>Moderator Endpoint</strong></td>
  </tr>
  <tr>
    <td><img src="https://github.com/user-attachments/assets/af7c2662-a339-4d86-83cc-ba66ebe2f93d" alt="Moderator Access" width="500"></td>
    <td><img src="https://github.com/user-attachments/assets/b8cc1e2b-9609-4225-9373-8a18697b1cd1" alt="Endpoint" width="500"></td>
  </tr>
</table>

---


