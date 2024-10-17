
package week7;

import java.util.Scanner;

class NhanVienNghienCuu extends NhanVien {
    private String chuyenMon;
    private double phuCapDH;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuyen mon: ");
        chuyenMon = sc.nextLine();
        System.out.println("Nhap phu cap doc hai: ");
        phuCapDH = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + chuyenMon);
        System.out.println("Phu cap doc hai: " + phuCapDH);
    }

    @Override
    public double tinhLuong() {
        return luongCB + phuCapDH;
    }
}

// Lớp NhanVienPhucVu kế thừa NhanVien
class NhanVienPhucVu extends NhanVien {
    @Override
    public double tinhLuong() {
        return luongCB;
    }
}