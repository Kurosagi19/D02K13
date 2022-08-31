package OOP.Work1;

import java.util.Scanner;

public class Person {
    public static Scanner input = new Scanner(System.in);
    public String ten;
    public String gioiTinh;
    public String diaChi;
    public String ngaySinh;


    public String toString() {
        return "Giao vien" + '\n' +
                "Ho va Ten: " + ten + '\n' +
                "Gioi tinh: " + gioiTinh + '\n' +
                "Dia chi: " + diaChi + '\n' +
                "Ngay sinh: " + ngaySinh + '\n';
//                "Email: " + email + '\n' +
//                "So Can Cuoc: " + canCuoc + '\n' +
//                "Chuyen nganh: " + chuyenNganh + '\n' +
//                "Luong co ban: " + luongCoBan + '\n' +
//                "Luong theo gio: " + luongTheoGio + '\n' +
//                "So gio lam: " + soGioLam + '\n';
    }
}
