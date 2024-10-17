package week5;

import java.util.Scanner;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private double gia;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
    }

    public HangHoa(HangHoa hangHoa) {
        this.maHang = hangHoa.maHang;
        this.tenHang = hangHoa.tenHang;
        this.gia = hangHoa.gia;
    }
    
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Ma Hang = " + maHang + 
               "\nTen Hang = " + tenHang + 
               "\nGia = " + gia;
    }
    
    public void nhapHang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        this.maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        this.tenHang = sc.nextLine();
        System.out.println("Nhap gia: ");
        this.gia = sc.nextDouble();
        sc.nextLine();
    }
    
    public void xuatThongTin() {
        System.out.println("Ma Hang = " + maHang);
        System.out.println("Ten Hang = " + tenHang);
        System.out.println("Gia = " + gia);
    }
}
