package week2.lab2;

import java.util.Scanner;

public class E3_TongCacChuSo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so N co 2 chu so: ");
        int so = sc.nextInt();
        
        String soString = String.format("%d", so);
        int hangChuc = Character.getNumericValue(soString.charAt(0));
        int hangDonVi = Character.getNumericValue(soString.charAt(1));
        
        int tong = hangChuc + hangDonVi;
        
        System.out.printf("Tong cac chu so: %d + %d = %d\n", hangChuc, hangDonVi, tong);
    }

}
