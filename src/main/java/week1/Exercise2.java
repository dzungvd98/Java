/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author Dung Vu
 */
public class Exercise2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma sinh vien: ");
        String maSinhVien = sc.nextLine();
        System.out.print("Nhap vao ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap vao tuoi sinh vien: ");
        int tuoi = sc.nextInt();
        System.out.print("Nhap vao nam sinh: ");
        int namSinh = sc.nextInt();
        System.out.print("Nhap vao diem trung binh: ");
        float diemTrungBinh = sc.nextFloat();
        
        System.out.println("Ma Sinh Vien: " + maSinhVien);
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Diem trung binh: " + diemTrungBinh);
        
        
    }
}
