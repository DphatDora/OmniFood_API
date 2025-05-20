# 🍔 **OmniFoodAPI - Fast Food Ordering System**

**OmniFoodAPI** is a **RESTful API** system that supports online food ordering, integrating **VNPAY payment**, **Android push notifications (FCM)**, and comprehensive features for order management, personal accounts, shopping cart, and delivery status tracking.

---

## 📌 **Feature List**

### **2.1. 🔐 Login**

- Allows users to login with **email and password** (SHA512 encryption)
- Supports **Google** login

### **2.2. 📝 Registration**

- Users create accounts with basic information: **name, email/phone number, password**
- **OTP** verification

### **2.3. 🔁 Password Recovery**

- Send **OTP code** to email for password recovery
- Verify and update new password

### **2.4. 🍱 Product Management (View, Cart, Favorites)**

- Display product list by category, product details
- Add/remove items from **shopping cart** and **favorites list**

### **2.5. 🛒 Ordering**

- Create orders from shopping cart
- Save **order history**

### **2.6. 💳 VNPAY Payment**

- Integrate **VNPAY payment gateway**
- Automatic **payment status** update after VNPAY response

### **2.7. 📦 Order Status Tracking**

- Status updates:  
  `Processing → Delivering → Completed → Cancelled`
- Users can track status in **real-time**

### **2.8. 🔔 Android Push Notifications**

- Using **Firebase Cloud Messaging (FCM)**
- Send notifications for:
  - Order creation
  - Order status changes
  - New promotions

### **2.9. 🙍‍♂️ Personal Information Management**

- View and edit account information
- Change password
- Update profile picture

---

## 🛠 **Technologies Used**

- **Backend**: Spring Boot (Java)
- **Database**: MySQL
- **ORM**: Spring Data JPA
- **Authentication**: Spring Security + JWT + SHA512
- **Payment**: VNPAY REST API
- **Notifications**: Firebase Cloud Messaging (FCM)
- **IDE**: IntelliJ IDEA

---

## 📦 Installation Guide (Local Development)

### 🧾 1. Clone the project

```bash
git clone https://github.com/raichuvn11/AppFastFood
```

### 🛠 2. Create MySQL Database

Use MySQL Workbench to restore the database from the [db_fastfood.sql](https://github.com/raichuvn11/AppFastFood/blob/main/db_fastfood.sql) file available in the project repository on GitHub.
Steps to follow:

- **Open MySQL Workbench and connect to your MySQL server**
- **Create a new database (e.g., named db_fastfood)**
- **Go to menu: Server → Data Import**
- **Select `Import from Self-Contained File` and choose the path to `db_fastfood.sql`**
- **Select Default Schema as your database name (e.g., db_fastfood) and click `Start Import`**

### ⚙️ 3. Configure application.properties

```properties
# Database
spring.datasource.url=jdbc:mysql://localhost:3306/db_fastfood
spring.datasource.username=root
spring.datasource.password=yourpassword
```

### 🧪 4. Open and Run in IntelliJ IDEA (or other compatible IDEs)

### 🌐 5. Access Swagger UI to use the API

```
http://localhost:8080/swagger-ui/index.html
```

---

## 👥 Team Members

- **Nguyễn Mạnh Tú**
- **Hà Đức Phát**

_The team collaborated closely to complete the OmniFoodAPI system, ensuring stable and efficient functionality._
