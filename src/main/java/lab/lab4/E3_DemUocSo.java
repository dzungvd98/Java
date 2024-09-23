package week2.lab4;

import java.util.Scanner;

public class E3_DemUocSo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.printf("So luong uoc so cua %d la: %d\n", n, count);
    }

}
