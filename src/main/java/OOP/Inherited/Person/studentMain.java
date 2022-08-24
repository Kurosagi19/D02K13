package OOP.Inherited.Person;


public class studentMain extends Person {
    static studentMain sv1 = new studentMain();

    public static void nhapThongTin() {
        System.out.print("Ho va ten: ");
        sv1.ten = input.nextLine();
        System.out.print("Gioi tinh: ");
        sv1.gioiTinh = input.nextLine();
        System.out.print("Dia chi: ");
        sv1.diaChi = input.nextLine();
        System.out.print("Ngay thang nam sinh: ");
        sv1.ngaySinh = input.nextLine();
        System.out.print("Ma sinh vien: ");
        sv1.maSV = input.nextLine();
        System.out.print("Email: ");
        sv1.email = input.nextLine();
    }

    public static void hocBong() {
        System.out.print("Nhap diem trung binh cua sinh vien: ");
        sv1.diemTB = input.nextInt();
        if (sv1.diemTB >= 8) {
            System.out.print("Sinh vien du dieu kien nhan hoc bong");
        } else {
            System.out.print("Sinh vien khong du dieu kien nhan hoc bong");
        }
    }
    public static void inThongTin() {
        System.out.println(sv1.toString());
    }

    public static void main(String[] args) {
        System.out.println("Nhap thong tin sinh vien");
        nhapThongTin();
        inThongTin();
        hocBong();
    }
}
