package week2.lab4;

import java.util.Scanner;

public class E9_KiemTraSoHoanThien {
    
    public static boolean isPerfect(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        return sum == x;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen duong x: ");
        int x = sc.nextInt();
        
        if (isPerfect(x)) {
            System.out.printf("%d la so hoan thien.\n", x);
        } else {
            System.out.printf("%d khong phai la so hoan thien.\n", x);
        }
    }

}
