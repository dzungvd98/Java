package week2.lab3;

import java.util.Scanner;

public class E10_KiemTraTamGiac {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao canh a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao canh b: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao canh c: ");
        int c = sc.nextInt();
        
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Day la tam giac deu.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Day la tam giac can.");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Day la tam giac vuong.");
            } else {
                System.out.println("Day la tam giac thuong.");
            }
        } else {
            System.out.println("Day khong phai la tam giac.");
        }
    }

}
