package week2.lab2;

import java.util.Scanner;

public class E8_KiemTraChanLe {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen n: ");
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println(n + " la so chan.");
        } else {
            System.out.println(n + " la so le.");
        }
    }

}
