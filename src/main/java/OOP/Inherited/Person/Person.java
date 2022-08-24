package OOP.Inherited.Person;

// Tạo một lớp Person lưu trữ các thông tin sau đây (tên, giới tính, địa chỉ, ngày sinh)
// Tạo một lớp Student kế thừa từ lớp Person lưu trữ các thôn gtin sau đây (mã sinh viên, điểm trung bình, email)
// Viết một phương thức nhập thông tin của student
// Viết một phương thức hiển thị thông tin của student
// Viết phương trình xem xét có học sinh nào được học bổng không ?
// Điểm trung bình hơn 8.0 sẽ được học bổng

import java.util.Scanner;

public class Person {

    public static Scanner input = new Scanner(System.in);
    public String ten;
    public String gioiTinh;
    public String diaChi;
    public String ngaySinh;
    public String maSV;
    public static int diemTB;
    public String email;

    public String toString() {
        return "Student" + '\n' +
                "Ho va Ten: " + ten + '\n' +
                "Gioi tinh: " + gioiTinh + '\n' +
                "Dia chi: " + diaChi + '\n' +
                "Ngay sinh: " + ngaySinh + '\n' +
                "Email: " + email + '\n';
    }
}
