package week2.lab4;

import java.util.Scanner;

public class E6_TongUocNhoHonChinhNo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.printf("Tong cac uoc so nho hon %d la: %d\n", n, sum);
    }

}
