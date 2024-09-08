package week2.lab3;

import java.util.Scanner;

public class E3_ThuTuTangDan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap vao so c: ");
        int c = sc.nextInt();
        
        int temp;
        
        // Sắp xếp a, b, c theo thứ tự tăng dần
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        
        System.out.printf("Thu tu tang dan la: %d %d %d\n", a, b, c);
    }

}
