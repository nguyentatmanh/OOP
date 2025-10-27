# OOP

## Lập trình hướng đối tượng JAVA

### Câu 1. 

Xây dựng chương trình quản lý thông tin sách cho thư viện thao tác trên cửa sổ dòng lệnh theo các yêu cầu như sau:

1. Chương trình quản lý gồm 2 loại sách: Sách truyện và sách kỹ thuật

• Nội dung trong cả 2 loại sách: Tên sách, tác giả, số trang

• Nội dung trong sách là truyện (FictionBook): Thể loại của sách truyện

• Nội dung trong sách kỹ thuật (TechnicalBook): Tên chủ đề sách kỹ thuật

2. Cần xây dựng các hàm trả ra thông tin sách (hàm toString), hàm tính toán giá sách (hàm calculatePrice). Trong đó:

• Hàm toString cần trả ra một chuỗi gồm tất cả các trường thông tin có trong đổi tượng sách tuỳ theo là loại sách nào

• Hàm calculatePrice sẽ được tính toán tuỳ theo là loại sách nào:

- Sách truyện: trả về giá sách tính bằng 1000* số trang

- Sách kỹ thuật: giá sách vẫn được tính bằng 1000* số trang tuy nhiên sau đó sẽ được giảm theo bậc thang 1% cho phần tiền từ Ođ, giảm 3% cho phần tiền từ 100,000 trở lên, số tiền được giảm 5% cho phần tiền từ 150,000 trở lên.

### Câu 2:

Xây dựng một form quản lý thông tin sách kỹ thuật sử dụng Java Swing theo các yêu cầu như
sau:

• Xãy dựng một form sử dụng Jframe để tạo một giao diện người dùng quản lý thông tin sách gồm các thao tác thêm (khi click vào nút "Thêm") và hiển thị danh sách (hiển thị thông qua
JList)

• Các trường thông tin của sách kỹ thuật bao gồm tất cả các trường trong class TechnicalBook ở câu 1 (sử dụng lại class TechnicalBook). Các trường thông tin được nhập thông qua các thành phần giao diện đã học. Các trường thông tin cần được kiểm tra bắt buộc nhập và đúng định dạng dữ liệu (đúng kiểu chuỗi, đúng kiểu số) khi thao tác "Thêm" nếu không hợp lệ cần thông báo lỗi thông qua hàm JOptionPane.showMessageDialog().

• Giao diện được tự do thiết kế gồm đầy đủ các phần: label (mô tả tên trường thông tin trước sách)
text input), text input (nhập thông tin), button (xử lý sự kiện thêm), jlist (hiến thị danh sách).
