package Assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class phones {

    public static Scanner input = new Scanner(System.in);
    public String phoneName;
    public String manufacturer;
    public String phoneIMEI;
    public double price;
    public String releaseDate;
    public double RAM;
    public double ROM;
    public String chip;
    public String screenSize;
    public String phoneSize;
    private String file;

    public phones() {

    }

    public phones(String phoneName, String manufacturer, String phoneIMEI, double price, String releaseDate, double RAM, double ROM, String chip, String screenSize, String phoneSize) {
        this.phoneName = phoneName;
        this.manufacturer = manufacturer;
        this.phoneIMEI = phoneIMEI;
        this.price = price;
        this.releaseDate = releaseDate;
        this.RAM = RAM;
        this.ROM = ROM;
        this.chip = chip;
        this.screenSize = screenSize;
        this.phoneSize = phoneSize;
    }


    public class phoneManager {
        private ArrayList phoneList;

        public phoneManager() {
            phoneList = new ArrayList(100);
        }

        public void phoneAdd(phones p) {
            phoneList.add(p);
        }

        public void phoneInsert() {
            phones p;
            System.out.println("===== Nhap thong tin thiet bi =====");
            System.out.print("Nhap ten dien thoai: ");
            phoneName = input.nextLine();
            System.out.print("Nha phat hanh: ");
            manufacturer = input.nextLine();
            System.out.print("IMEI: ");
            phoneIMEI = input.nextLine();
            System.out.print("Nhap loai chip: ");
            chip = input.nextLine();
            System.out.print("Kich co man hinh: ");
            screenSize = input.nextLine();
            System.out.print("Kich co dien thoai: ");
            phoneSize = input.nextLine();
            System.out.print("Nhap RAM: ");
            RAM = input.nextDouble();
            System.out.print("Nhap ROM: ");
            ROM = input.nextDouble();
            System.out.print("Nhap gia ban: ");
            price = input.nextDouble();
            System.out.print("Ngay phat hanh: ");
            releaseDate = input.nextLine();
            input.nextLine();
        }
    }


}

