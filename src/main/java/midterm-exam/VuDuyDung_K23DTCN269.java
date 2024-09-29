package com.myexercise.vuduydung_k23dtcn269;

import java.util.Scanner;

/**
 * Ho ten: Vu Duy Dung
 * MSSV: K23DTCN269 
 * Lop: D23TXCN04-K
 */
public class VuDuyDung_K23DTCN269 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachOTo ds = new DanhSachOTo();
        int luaChon;
        do {            
            System.out.println("=== Menu ===");
            System.out.println("1. Nhap danh sach o to");
            System.out.println("2. In danh sach o to");
            System.out.println("3. Tim o to theo hang san xuat");
            System.out.println("4. Sap xep o to theo gia ban");
            System.out.println("0. Thoat");
            System.out.print("Chon mot tuy chon: ");
            luaChon = sc.nextInt();
            
            switch (luaChon) {
                case 1 -> ds.nhapDanhSachOTo();
                case 2 -> ds.inDanhSachOTo();
                case 3 -> {
                    System.out.print("Nhap hang san xuat can tim: ");
                    sc.nextLine();
                    String hangSanXuat = sc.nextLine();
                    ds.timOToTheoHangSanXuat(hangSanXuat);
                }
                case 4 -> ds.sapXepTheoGiaBan();
                case 0 -> System.out.println("Thoat chuong trinh.");
                default -> System.out.println("Tuy chon khong hop le. Vui long thu lai.");
            }
        } while (luaChon != 0);
    }
}
