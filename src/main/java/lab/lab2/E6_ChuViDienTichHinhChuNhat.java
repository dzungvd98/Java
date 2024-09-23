package week2.lab2;

import java.util.Scanner;

public class E6_ChuViDienTichHinhChuNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao chieu dai: ");
        int chieuDai = sc.nextInt();
        System.out.print("Nhap vao chieu rong: ");
        int chieuRong = sc.nextInt();
        
        int chuVi = 2 * (chieuDai + chieuRong);
        int dienTich = chieuDai * chieuRong;
        
        System.out.printf("Chu vi hinh chu nhat: %d\n", chuVi);
        System.out.printf("Dien tich hinh chu nhat: %d\n", dienTich);
    }

}
