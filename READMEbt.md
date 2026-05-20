### Các xung đột và lỗi phát sinh từ việc bổ sung các thư viện:
- **Logback Classic 1.4.11**
- **Hibernate Core 6.2.0.Final**
- **JUnit Jupiter 5.9.2**

## Là 
- *Lỗi Version*
- *Lỗi Dependency*
- *Lỗi Maven download*

# Các lỗi đã gặp trong bài (cá nhân em đã gặp):
***Lỗi 1: Maven không nhận Dependency***
```aiignore
Log: Cannot resolve symbol slf4j
```
**Nguyên nhân:**
- Maven chưa xử lí reload
- pom.xml sai schema

**Cách xử lý:**
- sửa `schemaLocation`
- Reload Maven Project

**Lỗi 2: ${logback.version} not found - lỗi khai báo phiên bản**
```aiignore
Log: Could not find artifact ... ${logback.version}
```
**Nguyên nhân:**
Gọi ở `<dependency>` nhưng chưa khai báo `<logback.version>` ở `<property>`

**Giải pháp**
Gọi thẳng `logback version` ở thẻ `<version>` trong `<dependency>` của `logback` hoặc khai báo `<logback.version>` ở `<property>`

# Các lỗi khác
***3. Lỗi Dependency***\
**Nguyên nhân:** Maven chưa tải hoặc khai báo sai `dependency`\
**Giải pháp:**\
*Khai báo đúng:*

```
<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>${logback.version}</version>
</dependency>
```
Sau đó **Reload Maven Project**

**Sau đó chạy `mvn clean test` nếu `Build Success` thì ok.




