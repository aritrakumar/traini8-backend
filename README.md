# Traini8 Backend (Spring Boot)

This is a **Spring Boot backend** for managing government-funded training centers.

## 🚀 Features
✅ Create and Save Training Centers  
✅ Retrieve All Training Centers  
✅ Validation using **Spring Boot Validation**  
✅ **Exception Handling** using `@RestControllerAdvice`  
✅ Database: **H2 (Local)** / **MySQL (Production)**  

---

## 🛠️ Installation

### 1️⃣ Clone the Repository
```sh
git clone https://github.com/aritrakumar/traini8-backend.git
cd traini8-backend
```

### 2️⃣ Setup `.env`
Create a `.env` file in the root directory and configure:
```sh
DB_HOST=localhost
DB_PORT=3306
DB_NAME=traini8
DB_USER=root
DB_PASS=your_password
PORT=8080
```

### 3️⃣ Install Dependencies
```sh
mvn clean install
```

### 4️⃣ Run the Application
```sh
mvn spring-boot:run
```

---

## 🔹 API Endpoints

### **1️⃣ Create Training Center**
**POST** `/api/training-centers`
```json
{
  "centerName": "XYZ Training Center",
  "centerCode": "XYZ123456789",
  "address": {
    "detailedAddress": "456 Market St",
    "city": "San Francisco",
    "state": "CA",
    "pincode": "94103"
  },
  "studentCapacity": 300,
  "coursesOffered": ["Java", "Spring Boot"],
  "contactEmail": "xyz@example.com",
  "contactPhone": "1234567890"
}
```

### **2️⃣ Get All Training Centers**
**GET** `/api/training-centers`
```json
[
  {
    "centerName": "XYZ Training Center",
    "centerCode": "XYZ123456789",
    "address": {
      "detailedAddress": "456 Market St",
      "city": "San Francisco",
      "state": "CA",
      "pincode": "94103"
    },
    "studentCapacity": 300,
    "coursesOffered": ["Java", "Spring Boot"]
  }
]
```

---

## 📝 Contribution & Usage
This repository is open-source and can be used or modified for any personal or professional project. Feel free to fork and contribute.

---

## 🎯 Final Checks Before Deployment
✅ Ensure **H2 or MySQL** is configured  
✅ Run `mvn spring-boot:run` and test APIs  
✅ Use `.env.example` to create `.env`  

🚀 **Happy coding!** Let me know if you need any refinements! 🎯

