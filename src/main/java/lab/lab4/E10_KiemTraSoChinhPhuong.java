package week2.lab4;

import java.util.Scanner;

public class E10_KiemTraSoChinhPhuong {
    
    public static boolean isSquare(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen duong x: ");
        int x = sc.nextInt();
        
        if (isSquare(x)) {
            System.out.printf("%d la so chinh phuong.\n", x);
        } else {
            System.out.printf("%d khong phai la so chinh phuong.\n", x);
        }
    }

}
