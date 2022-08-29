package OOP.Abstraction.Work0;

public class hinhVuong implements hinhHoc{
    public double canh;

    @Override
    public void nhap() {
        System.out.print("Nhap canh: ");
        canh = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {

    }

    @Override
    public void tinhDienTich() {

    }
}
