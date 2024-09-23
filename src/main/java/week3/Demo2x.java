
package week3;

import java.util.Scanner;

public class Demo2x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập và xuất tọa độ c1
        Coordinate c1 = new Coordinate();
        c1.nhapToaDo();
        c1.xuatToaDo();

        // Tạo tọa độ c2 với tham số
        Coordinate c2 = new Coordinate(3, 4);
        c2.xuatToaDo();

        // Nhập giá trị x và y từ người dùng để tạo c3
        int x, y;
        System.out.print("Nhập giá trị x và y cho c3: ");
        x = sc.nextInt();
        y = sc.nextInt();
        
        Coordinate c3 = new Coordinate(x, y);
        c3.xuatToaDo();

        // Tính khoảng cách từ c1 đến c3 và in ra
        double distance = c1.khoangCach(c3);
        System.out.printf("Khoảng cách từ c1 đến c3: %.2f\n", distance);

        // Sao chép tọa độ c3 thành c4
        Coordinate c4 = new Coordinate(c3);
        c4.xuatToaDo();

        // Tính khoảng cách từ c2 đến c4 và in ra
        double distance2 = c2.khoangCach(c4);
        System.out.printf("Khoảng cách từ c2 đến c4: %.2f\n", distance2);
    }
}
