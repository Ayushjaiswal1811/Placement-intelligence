# 📌 Placement Intelligence

**Placement Intelligence** is a full-stack application built to help manage and visualize campus placement data.  
It provides RESTful APIs using **Spring Boot (Java)** for backend, a **React**-based frontend for interaction, and an optional **ML module** for insights and predictions.

---

## 🧠 Overview

This project is designed to support:
✔ Student profile management  
✔ Company management  
✔ Placement tracking  
✔ Authentication using JWT tokens  
✔ Admin dashboard  

The architecture separates concerns with clean backend APIs, secure authentication, and a responsive frontend UI.

---

## 🚀 Features

### Backend  
- REST APIs for Students, Companies, Placements  
- Role-based authentication (Admin)  
- JWT authentication support  
- MySQL integration  
- Clean layered architecture (Controller → Service → Repository)

### Frontend  
- Admin login page  
- Dashboard to view/manage entities  
- Protected routes using JWT  
- Modular React components

### Optional  
- Machine Learning module for future skill-based recommendations

---

## 📁 Project Structure

Placement-intelligence/
├── backend/ # Spring Boot APIs
├── frontend/ # React application
├── ml-module/ # Python ML support
└── README.md # Project documentation


---

## 🛠 Tech Stack

| Component | Technology |
|-----------|------------|
| Backend   | Spring Boot, Java |
| Frontend  | React, Axios, React Router |
| Database  | MySQL |
| Auth      | JWT Tokens |
| Others    | Maven, Node.js |

---

## 🚀 Getting Started

### 🧩 Prerequisites
Install these before running the project:

- Java JDK 17+  
- Node.js & npm  
- MySQL server  
- (Optional) Python for ML module  

---

### 📌 Backend Setup

1. **Create MySQL Database**
   ```sql
   CREATE DATABASE placement_db;
Configure application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/placement_db
spring.datasource.username=root
spring.datasource.password=your_password


Run Spring Boot

cd backend
mvn spring-boot:run

📌 Frontend Setup

Navigate to frontend folder:

cd frontend


Install dependencies:

npm install


Start the app:

npm start


Open on browser:

http://localhost:3000

🔐 Authentication

Login endpoint:

POST http://localhost:8081/api/auth/login


Params:

Key	Value
username	admin
password	admin123

Response includes a JWT token for protected API calls.

🧪 API Examples
Get Students
GET /api/students


Protected (requires JWT)

Add Company
POST /api/companies


With JSON body:

{
  "name": "Google",
  "location": "California",
  "packageOffered": "30 LPA"
}

🏁 Next Steps

You can extend this project with:
✅ Swagger API docs
✅ Deployment (Heroku / Vercel)
✅ Docker containers
✅ More detailed ML features

🤝 Contributing

Contributions are welcome!

Fork the repository

Create a feature branch

Submit a pull request

📝 License

This project is open-source — feel free to use and modify!

📬 Contact

⭐ Star the repo if you find it helpful!
📩 Connect: LinkedIn


---

If you want, I can also help add **badges** (like build, stars, license) or include **screenshots/live demos** in this README to make it even more impressive. Just let me know! :contentReference[oaicite:1]{index=1}
::contentReference[oaicite:2]{index=2}
