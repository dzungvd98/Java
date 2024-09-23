
package week3;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        int soLuong = sc.nextInt();
        HocSinh dsHocSinh[] = new HocSinh[soLuong];
        
        // Nhap thong tin cho danh sach hoc sinh
        for(int i = 0; i < soLuong; i++) {
            dsHocSinh[i] = new HocSinh();
            dsHocSinh[i].input();
        }
        
        // In danh sach hoc sinh
        System.out.println("Danh sach hoc sinh gom co: ");
        for(int i = 0; i < soLuong; i++) {
            System.out.println("So thu tu " + (i+1) + ": ");
            dsHocSinh[i].output();
        }
    }
}
