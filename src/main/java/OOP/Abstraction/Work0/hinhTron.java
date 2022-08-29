package OOP.Abstraction.Work0;

public class hinhTron implements hinhHoc{
    public double bankinh;
    @Override
    public void nhap() {
        System.out.print("Nhap ban kinh: ");
        bankinh = input.nextDouble();
    }

    @Override
    public void tinhChuVi() {
        double chuvi;
        chuvi = bankinh * 2 * Math.PI;
        System.out.println("Chu vi la: " + chuvi);
    }

    @Override
    public void tinhDienTich() {
        double dientich;
        dientich = bankinh * bankinh * Math.PI;
        System.out.println("Dien tich la: " + dientich);
    }
}
