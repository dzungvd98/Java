package week2.lab2;

import java.util.Scanner;

public class E10_TrungBinhCong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao so c: ");
        int c = sc.nextInt();
        System.out.print("Nhap vao so d: ");
        int d = sc.nextInt();
        
        double trungBinhCong = (a + b + c + d) / 4.0;
        
        System.out.printf("Trung binh cong cua 4 so: %.2f\n", trungBinhCong);
    }

}
