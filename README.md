# 🍔 **OmniFoodAPI – Hệ thống đặt đồ ăn nhanh**

**OmniFoodAPI** là hệ thống **RESTful API** hỗ trợ người dùng đặt món ăn trực tuyến, tích hợp **thanh toán VNPAY**, **thông báo đẩy trên Android (FCM)**, và đầy đủ chức năng quản lý đơn hàng, tài khoản cá nhân, giỏ hàng và trạng thái vận chuyển.

---

## 📌 **Danh sách chức năng**

### **2.1. 🔐 Đăng nhập**
- Cho phép người dùng đăng nhập bằng **email và mật khẩu** (mã hóa SHA512)
- Hỗ trợ đăng nhập bằng **Google**

### **2.2. 📝 Đăng ký**
- Người dùng tạo tài khoản với các thông tin cơ bản: **tên, email/số điện thoại, mật khẩu**
- Xác thực bằng **OTP**

### **2.3. 🔁 Quên mật khẩu**
- Gửi **mã OTP** về email để khôi phục mật khẩu
- Xác minh và cập nhật mật khẩu mới

### **2.4. 🍱 Quản lý sản phẩm (Xem, Thêm giỏ hàng, Yêu thích)**
- Hiển thị danh sách sản phẩm theo loại, chi tiết sản phẩm  
- Thêm/xoá món ăn khỏi **giỏ hàng** và **danh sách yêu thích**

### **2.5. 🛒 Đặt hàng**
- Tạo đơn hàng từ giỏ hàng  
- Lưu **lịch sử đơn hàng**

### **2.6. 💳 Thanh toán bằng VNPAY**
- Tích hợp **cổng thanh toán VNPAY**
- Tự động cập nhật **trạng thái thanh toán** sau phản hồi từ VNPAY

### **2.7. 📦 Theo dõi trạng thái đơn hàng**
- Cập nhật trạng thái:  
  `Đang xử lý → Đang giao → Hoàn tất → Đã hủy`  
- Người dùng có thể xem trạng thái **theo thời gian thực**

### **2.8. 🔔 Gửi nhận thông báo Android**
- Sử dụng **Firebase Cloud Messaging (FCM)**  
- Gửi thông báo khi:
  - Đơn hàng được tạo
  - Trạng thái đơn hàng thay đổi
  - Có khuyến mãi mới

### **2.9. 🙍‍♂️ Quản lý thông tin cá nhân**
- Xem và chỉnh sửa thông tin tài khoản  
- Đổi mật khẩu  
- Cập nhật ảnh đại diện

---

## 🛠 **Công nghệ sử dụng**

- **Backend**: Spring Boot (Java)  
- **Database**: MySQL  
- **ORM**: Spring Data JPA  
- **Xác thực**: Spring Security + JWT + SHA512  
- **Thanh toán**: VNPAY REST API  
- **Thông báo**: Firebase Cloud Messaging (FCM)  
- **IDE**: IntelliJ IDEA

---
## 📦 Hướng dẫn cài đặt (Local Development)

### 🧾 1. Clone dự án

```bash
git clone https://github.com/raichuvn11/AppFastFood
```
### 🛠 2. Tạo cơ sở dữ liệu MySQL
Sử dụng MySQL Workbench để khôi phục cơ sở dữ liệu từ file [db_fastfood.sql](https://github.com/raichuvn11/AppFastFood/blob/main/db_fastfood.sql) có sẵn trong thư mục dự án trên GitHub.
Các bước thực hiện:
- **Mở MySQL Workbench và kết nối với server MySQL của bạn.**

- **Tạo một cơ sở dữ liệu mới (ví dụ tên là db_fastfood)**

- **Vào menu: Server → Data Import**

- **Chọn `Import from Self-Contained File` và chọn đường dẫn đến file `db_fastfood.sql`**

- **Chọn Default Schema là tên cơ sở dữ liệu vừa tạo (ví dụ tên là db_fastfood) và bấm `Start Import`**

### ⚙️ 3. Cấu hình tệp application.properties
```properties
# Database
spring.datasource.url=jdbc:mysql://localhost:3306/db_fastfood
spring.datasource.username=root
spring.datasource.password=yourpassword
```
### 🧪 4. Mở và chạy trong IntelliJ IDEA(hoặc IDE khác nếu có thể)
### 🌐 5. Truy cập Swagger UI để dùng API
```
http://localhost:8080/swagger-ui/index.html
```
---
## 👥 Thành viên thực hiện

- **Nguyễn Mạnh Tú**
- **Hà Đức Phát**
  
*Đội ngũ đã phối hợp chặt chẽ để hoàn thiện hệ thống OmniFoodAPI, đảm bảo tính năng ổn định và hiệu quả.*
