package week2.lab3;

import java.util.Scanner;

public class E4_ChuSoLonNhat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen co 3 chu so: ");
        int n = sc.nextInt();
        
        String soString = String.format("%d", n);
        char maxChar = soString.charAt(0);
        int viTri = 0;
        
        for (int i = 1; i < soString.length(); i++) {
            if (soString.charAt(i) > maxChar) {
                maxChar = soString.charAt(i);
                viTri = i;
            }
        }
        
        String[] viTriText = {"hang tram", "hang chuc", "hang don vi"};
        
        System.out.printf("Chu so lon nhat la %c o %s\n", maxChar, viTriText[viTri]);
    }

}
