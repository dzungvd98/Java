package week2.lab3;

import java.util.Scanner;

public class E2_GiaTriNhoNhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao so c: ");
        int c = sc.nextInt();
        
        int min = Math.min(a, Math.min(b, c));
        
        System.out.printf("Gia tri nho nhat la: %d\n", min);
    }

}
