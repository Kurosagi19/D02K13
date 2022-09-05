package Assignment;

import java.util.Scanner;

public class phone {
    public static Scanner input = new Scanner(System.in);
    public String phoneName;
    public String manufacturer;
    public double phoneIMEI;
    public double price;
    public String releaseDate;
    public double RAM;
    public double ROM;
    public String chip;
    public String screenSize;
    public String phoneSize;

//    Nhap thong tin thiet bi
    public void phoneInsert() {
        System.out.println("Nhap thong tin thiet bi:");
        System.out.print("Nhap ten dien thoai: ");
        phoneName = input.nextLine();
        System.out.print("Nha phat hanh: ");
        manufacturer = input.nextLine();
        System.out.print("IMEI: ");
        phoneIMEI = input.nextDouble();
        System.out.print("Nhap gia ban: ");
        price = input.nextDouble();
        System.out.print("Ngay phat hanh: ");
        releaseDate = input.nextLine();
        System.out.print("Nhap RAM: ");
        RAM = input.nextDouble();
        System.out.print("Nhap ROM: ");
        ROM = input.nextDouble();
        System.out.print("Nhap loai chip: ");
        chip = input.nextLine();
        System.out.print("Kich co man hinh: ");
        screenSize = input.nextLine();
        System.out.print("Kich co dien thoai: ");
        phoneSize = input.nextLine();
    }

//    Hien thi toan bo thiet bi
    public String phoneDisplay() {
        return "Phone" + '\n' +
                "Nha san xuat: " + manufacturer + '\n' +
                "Ten dien thoai: " + phoneName + '\n' +
                "IMEI: " + phoneIMEI + '\n' +
                "RAM: " + RAM + '\n' +
                "ROM: " + ROM + '\n' +
                "Loai chip: " + chip + '\n' +
                "Kich thuoc man hinh: " + screenSize + '\n' +
                "Kich thuoc dien thoai: " + phoneSize + '\n' +
                "Ngay phat hanh: " + releaseDate + '\n' +
                "Gia: " + price + '\n';
    }
}
