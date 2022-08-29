package OOP.Abstraction.Work0;

public class main {
    public static void main(String[] args) {
        System.out.println("Hinh chu nhat");
        hinhChuNhat hcn = new hinhChuNhat();
        hcn.nhap();
        hcn.tinhChuVi();
        hcn.tinhDienTich();

        System.out.println("Hinh vuong");
        hinhVuong hv = new hinhVuong();
        hv.nhap();
        hv.tinhChuVi();
        hv.tinhDienTich();

        System.out.println("Hinh tron");
        hinhTron ht = new hinhTron();
        ht.nhap();
        ht.tinhChuVi();
        ht.tinhDienTich();
    }
}
