package week2.lab2;

import java.util.Scanner;

public class E7_GiaTriNhoNhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        
        int min = Math.min(a, b);
        
        System.out.printf("Gia tri nho nhat la: %d\n", min);
    }

}
