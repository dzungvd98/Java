package week2.lab4;

import java.util.Scanner;

public class E2_TongUocSo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();
        
        int sum = 0;
        System.out.printf("Tong cac uoc so cua %d la: ", n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
