package week2.lab2;

import java.util.Scanner;

public class E5_DoiThoiGian {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao thoi gian (tinh bang giay): ");
        int totalSeconds = sc.nextInt();
        
        int gio = totalSeconds / 3600;
        int phut = (totalSeconds % 3600) / 60;
        int giay = totalSeconds % 60;
        
        System.out.printf("%d gio, %d phut, %d giay\n", gio, phut, giay);
    }

}
