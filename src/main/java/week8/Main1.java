package week8;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HINH[] hinhArray = new HINH[3];

        for (int i = 0; i < hinhArray.length; i++) {
            System.out.println("Chon loai hinh (1: Hinh vuong, 2: Hinh chu nhat, 3: Hinh tron): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    hinhArray[i] = new HINHVUONG();
                    break;
                case 2:
                    hinhArray[i] = new HINHCN();
                    break;
                case 3:
                    hinhArray[i] = new HINHTRON();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    i--; // Giảm chỉ số để nhập lại
                    continue;
            }
            hinhArray[i].nhap();
        }

        System.out.println("\nThông tin các hình và diện tích:");
        for (HINH hinh : hinhArray) {
            hinh.xuat();
            System.out.println("Dien tich: " + hinh.dienTich());
        }
    }
}
