package week2.lab2;

import java.util.Scanner;

public class E4_DoiSangGiay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao gio: ");
        int gio = sc.nextInt();
        System.out.print("Nhap vao phut: ");
        int phut = sc.nextInt();
        System.out.print("Nhap vao giay: ");
        int giay = sc.nextInt();
        
        int tongGiay = gio * 3600 + phut * 60 + giay;
        
        System.out.printf("Tong so giay: %d\n", tongGiay);
    }

}
