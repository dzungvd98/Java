package week2.lab4;

import java.util.Scanner;

public class E8_KiemTraSoNguyenTo {
    
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen duong x: ");
        int x = sc.nextInt();
        
        if (isPrime(x)) {
            System.out.printf("%d la so nguyen to.\n", x);
        } else {
            System.out.printf("%d khong phai la so nguyen to.\n", x);
        }
    }

}
