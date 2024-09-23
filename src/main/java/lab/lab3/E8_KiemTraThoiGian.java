package week2.lab3;

import java.util.Scanner;

public class E8_KiemTraThoiGian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao gio: ");
        int gio = sc.nextInt();
        System.out.print("Nhap vao phut: ");
        int phut = sc.nextInt();
        System.out.print("Nhap vao giay: ");
        int giay = sc.nextInt();
        
        boolean isValid = (gio >= 0 && gio <= 23) && (phut >= 0 && phut <= 59) && (giay >= 0 && giay <= 59);
        
        if (isValid) {
            System.out.println("Thoi gian hop le.");
        } else {
            System.out.println("Thoi gian khong hop le.");
        }
    }

}
