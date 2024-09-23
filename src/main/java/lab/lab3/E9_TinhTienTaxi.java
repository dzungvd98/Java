package week2.lab3;

import java.util.Scanner;

public class E9_TinhTienTaxi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so km: ");
        int km = sc.nextInt();
        
        int tien;
        
        if (km == 1) {
            tien = 17000;
        } else if (km <= 30) {
            tien = 17000 + (km - 1) * 15000;
        } else {
            tien = 17000 + 29 * 15000 + (km - 30) * 12000;
        }
        
        System.out.printf("So tien phai tra: %d VND\n", tien);
    }

}
