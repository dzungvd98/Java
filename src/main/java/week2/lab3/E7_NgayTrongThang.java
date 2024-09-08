package week2.lab3;

import java.util.Scanner;

public class E7_NgayTrongThang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao thang: ");
        int thang = sc.nextInt();
        System.out.print("Nhap vao nam: ");
        int nam = sc.nextInt();
        
        int soNgay;
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgay = 31;
                break;
            case 4: case 6: case 9: case 11:
                soNgay = 30;
                break;
            case 2:
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    soNgay = 29;  // Năm nhuận
                } else {
                    soNgay = 28;
                }
                break;
            default:
                soNgay = 0;  // Tháng không hợp lệ
                break;
        }
        
        System.out.printf("Thang %d nam %d co %d ngay.\n", thang, nam, soNgay);
    }

}
