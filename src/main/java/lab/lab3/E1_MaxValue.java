package week2.lab3;

import java.util.Scanner;

public class E1_MaxValue {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = sc.nextInt();
        
        int max = Math.max(a, b);
        
        System.out.printf("Gia tri lon nhat la: %d\n", max);
    }

}
