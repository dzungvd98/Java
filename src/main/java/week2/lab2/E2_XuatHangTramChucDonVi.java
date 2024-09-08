
package week2.lab2;

import java.util.Scanner;

public class E2_XuatHangTramChucDonVi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so co 3 chu so: ");
        int so = sc.nextInt();
        
        String soString = String.format("%d", so);
        System.out.printf("Hang tram: %s\n", soString.charAt(0));
        System.out.printf("Hang chuc: %s\n", soString.charAt(1));
        System.out.printf("Hang don vi: %s\n", soString.charAt(2));
    }

}
