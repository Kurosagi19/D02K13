package OOP.Work1;

public class Teacher extends Person {
    public double canCuoc;
    public String email;
    public String chuyenNganh;
    public double luongCoBan;
    public double luongTheoGio;
    public double soGioLam;
    public double thang;
    public double nam;

    public void nhap() {
        System.out.println("Nhap thong tin giao vien:");
        System.out.print("Ho va ten: ");
        ten = input.nextLine();
        System.out.print("Gioi tinh: ");
        gioiTinh = input.nextLine();
        System.out.print("Dia chi: ");
        diaChi = input.nextLine();
        System.out.print("Ngay thang nam sinh: ");
        ngaySinh = input.nextLine();
        System.out.print("So can cuoc: ");
        canCuoc = input.nextDouble();
        System.out.print("Email: ");
        email = input.nextLine();
        input.nextLine();
        System.out.print("Chuyen nganh: ");
        chuyenNganh = input.nextLine();
        System.out.print("Luong co ban: ");
        luongCoBan = input.nextDouble();
        System.out.print("So gio lam: ");
        soGioLam = input.nextDouble();
    }

    public void hienThiThongTin() {
        System.out.println(super.toString());
    }

    public void tinhLuong() {
        luongCoBan = luongTheoGio * soGioLam;
        System.out.println("Tong so luong: " + luongCoBan);
    }
}
