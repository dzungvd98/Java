package week2.lab2;

import java.util.Scanner;

public class E1_InSinhVien {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ho va ten: ");
        String hoTen = sc.nextLine();
        
        System.out.print("Nhap MSSV: ");
        String MSSV = sc.nextLine();
        
        System.out.print("Nhap lop: ");
        String lop = sc.nextLine();
        
        System.out.print("Nhap so dien thoai: ");
        String soDienThoai = sc.nextLine();
        
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = sc.nextLine();
        
        System.out.printf("/***** THANH VIEN LOP %s *****/\n", lop);
        System.out.printf("Ho ten: %s\n", hoTen);
        System.out.printf("Ma so sinh vien: %s\n", MSSV);
        System.out.printf("Lop: %s\n", lop);
        System.out.printf("So dien thoai: %s      Gioi tinh: %s\n", soDienThoai, gioiTinh);
        System.out.println("/*********************************************/");
        
    }
}
