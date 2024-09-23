package week2.lab3;

import java.util.Scanner;

public class E6_NamNhuan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao nam: ");
        int nam = sc.nextInt();
        
        boolean isLeapYear;
        
        switch (nam % 4) {
            case 0:
                if (nam % 100 == 0 && nam % 400 != 0) {
                    isLeapYear = false;
                } else {
                    isLeapYear = true;
                }
                break;
            default:
                isLeapYear = false;
                break;
        }
        
        if (isLeapYear) {
            System.out.printf("%d la nam nhuan.\n", nam);
        } else {
            System.out.printf("%d khong phai la nam nhuan.\n", nam);
        }
    }

}
