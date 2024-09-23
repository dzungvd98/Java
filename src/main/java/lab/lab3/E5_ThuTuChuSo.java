package week2.lab3;

import java.util.Scanner;

public class E5_ThuTuChuSo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen co 3 chu so: ");
        int n = sc.nextInt();
        
        String soString = String.format("%d", n);
        char[] chars = soString.toCharArray();
        
        // Sắp xếp các chữ số theo thứ tự tăng dần
        char temp;
        if (chars[0] > chars[1]) {
            temp = chars[0];
            chars[0] = chars[1];
            chars[1] = temp;
        }
        if (chars[0] > chars[2]) {
            temp = chars[0];
            chars[0] = chars[2];
            chars[2] = temp;
        }
        if (chars[1] > chars[2]) {
            temp = chars[1];
            chars[1] = chars[2];
            chars[2] = temp;
        }
        
        System.out.printf("Thu tu tang dan cua cac chu so: %c%c%c\n", chars[0], chars[1], chars[2]);
    }

}
