package Assignment;

import java.util.Scanner;

public class baseSystem {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int case1;
        int case2;
        int case3;
        phones p1 = new phones();
        System.out.println("===== Chuong trinh quan ly dien thoai =====");
        System.out.println("1. Quan ly thiet bi");
        System.out.println("2. Cong cu chinh sua");
        System.out.print("Moi nhap lua chon: ");
        case1 = input.nextInt();
        switch (case1) {
            case 1:
                System.out.println("===== Quan ly thiet bi =====");
                System.out.println("1. Them thiet bi moi");
                System.out.println("2. Cap nhat thong tin thiet bi");
                System.out.println("3. Xoa thiet bi");
                System.out.println("4. Hien thi tat ca thiet bi");
                System.out.print("Moi nhap lua chon: ");
                case2 = input.nextInt();
                switch (case2) {
                    case 1:
                        System.out.println("1. Them thiet bi moi");
                        p1.phoneInsert();
                        break;
                    case 2:
                        System.out.println("2. Cap nhat thong tin thiet bi");
                        break;
                    case 3:
                        System.out.println("3. Xoa thiet bi");
                        break;
                    case 4:
                        System.out.println("4. Hien thi tat ca thiet bi");
                        p1.phoneDisplay();
                        break;
                } break;
            case 2:
                System.out.println("===== Cong cu chinh sua =====");
                System.out.println("1. Loc theo nha san xuat");
                System.out.println("2. Sap xep theo ngay san xuat");
                System.out.println("3. Loc theo gia");
                System.out.println("4. Sap xep theo gia");
                System.out.print("Moi nhap lua chon: ");
                case3 = input.nextInt();
                switch (case3) {
                    case 1:
                        System.out.println("1. Loc theo nha san xuat");
                        break;
                    case 2:
                        System.out.println("2. Sap xep theo ngay san xuat");
                        break;
                    case 3:
                        System.out.println("3. Loc theo gia");
                        break;
                    case 4:
                        System.out.println("4. Sap xep theo gia");
                        break;
                } break;
        }
    }
}

