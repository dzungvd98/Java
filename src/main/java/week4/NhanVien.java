package week4;

import java.util.Scanner;

public class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    private static int soLuongNhanVien = 0;

    // Constructor mac dinh
    public NhanVien() {
        this.maSo = "";
        this.hoTen = "";
        this.luongCoBan = 0;
        this.heSoLuong = 0;
        soLuongNhanVien++;
    }

    // Constructor co tham so
    public NhanVien(String maSo, String hoTen, double luongCoBan, double heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNhanVien++;
    }

    // Constructor sao chep
    public NhanVien(NhanVien nv) {
        this.maSo = nv.getMaSo();
        this.hoTen = nv.getHoTen();
        this.luongCoBan = nv.getLuongCoBan();
        this.heSoLuong = nv.getHeSoLuong();
        soLuongNhanVien++;
    }

    // Phuong thuc tinh luong
    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    // Nhap thong tin nhan vien tu ban phim
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        this.maSo = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        this.luongCoBan = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        this.heSoLuong = sc.nextDouble();
    }

    // toString de mo ta thong tin nhan vien
    @Override
    public String toString() {
        return "Ma so: " + maSo + ", Ho ten: " + hoTen + ", Luong co ban: " + luongCoBan +
               ", He so luong: " + heSoLuong + ", Luong: " + tinhLuong();
    }

    // Getter va Setter
    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    // Phuong thuc in so luong nhan vien
    public static void inSoLuongNhanVien() {
        System.out.println("So luong nhan vien hien co: " + soLuongNhanVien);
    }
}
