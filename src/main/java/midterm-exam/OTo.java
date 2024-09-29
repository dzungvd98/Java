
package com.myexercise.vuduydung_k23dtcn269;

import java.util.Scanner;

/**
 * Ho ten: Vu Duy Dung
 * MSSV: K23DTCN269 
 * Lop: D23TXCN04-K
 */
public class OTo {
    private String maXe;
    private Double donGia;
    private String hangSanXuat;
    private int soGhe;

    public OTo() {
    }

    public OTo(String maXe, Double donGia, String hangSanXuat, int soGhe, Double thue) {
        this.maXe = maXe;
        this.donGia = donGia;
        this.hangSanXuat = hangSanXuat;
        this.soGhe = soGhe;
    }
    
    public OTo(OTo xe) {
        this.maXe = xe.maXe;
        this.soGhe = xe.soGhe;
        this.donGia = xe.donGia;
        this.hangSanXuat = xe.hangSanXuat;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }
    
    public void nhapThongTinOTo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma xe: ");
        this.maXe = sc.nextLine();
        System.out.print("Nhap don gia: ");
        this.donGia = sc.nextDouble();
        System.out.print("Nhap hang san xuat: ");
        sc.nextLine();
        this.hangSanXuat = sc.nextLine();
        System.out.print("Nhap so ghe: ");
        this.soGhe = sc.nextInt();
    }
    
    public void xuatThongTinOTo() {
        System.out.printf("Ma xe: %s\n", this.maXe);
        System.out.printf("Don gia: %f\n", this.donGia);
        System.out.printf("Hang san xuat: %s\n", this.hangSanXuat);
        System.out.printf("So ghe: %d\n", this.soGhe);
        Double thueMuaXe = this.tinhThue();
        System.out.printf("Thue: %f\n", thueMuaXe);
        System.out.printf("Gia mua xe: %.2f\n", this.tinhGiaSauThue());
    }
    
    public Double tinhThue() {
        Double thue;
        if(this.soGhe <= 7) {
            thue = donGia * 1.2;
        } else {
            thue = donGia * 0.7;
        }
        return thue;
    }
    
    public Double tinhGiaSauThue() {
        return this.donGia + this.tinhThue();
    }
 
}
