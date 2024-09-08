package week2.lab4;

import java.util.Scanner;

public class E7_UocLeLonNhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();
        
        int maxOddDivisor = -1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                maxOddDivisor = i;
            }
        }
        if (maxOddDivisor != -1) {
            System.out.printf("Uoc so le lon nhat cua %d la: %d\n", n, maxOddDivisor);
        } else {
            System.out.println("Khong co uoc so le.");
        }
    }

}
