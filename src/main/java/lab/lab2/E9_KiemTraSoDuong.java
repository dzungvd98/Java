package week2.lab2;

import java.util.Scanner;

public class E9_KiemTraSoDuong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen n: ");
        int n = sc.nextInt();
        
        if (n > 0) {
            System.out.println(n + " la so duong.");
        } else {
            System.out.println(n + " khong phai la so duong.");
        }
    }

}
