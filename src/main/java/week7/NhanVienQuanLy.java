
package week7;

import java.util.Scanner;

class NhanVienQuanLy extends NhanVien {
    private String chuyenMon;
    private double phuCapCV;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuyen mon: ");
        chuyenMon = sc.nextLine();
        System.out.println("Nhap phu cap chuc vu: ");
        phuCapCV = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + chuyenMon);
        System.out.println("Phu cap chuc vu: " + phuCapCV);
    }

    @Override
    public double tinhLuong() {
        return luongCB + phuCapCV;
    }
}