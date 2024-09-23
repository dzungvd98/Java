package week3;

import java.util.Scanner;

public class Coordinate {
    private int x;
    private int y;

    // Constructor mặc định
    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor với tham số
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor sao chép
    public Coordinate(Coordinate c) {
        this.x = c.getX();
        this.y = c.getY();
    }

    // Phương thức nhập tọa độ từ người dùng
    public void nhapToaDo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập giá trị x: ");
        this.x = sc.nextInt();
        System.out.print("Vui lòng nhập giá trị y: ");
        this.y = sc.nextInt();
    }

    // Phương thức xuất tọa độ
    public void xuatToaDo() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }

    // Tính khoảng cách đến tọa độ khác
    public double khoangCach(Coordinate c) {
        int dx = this.x - c.getX();
        int dy = this.y - c.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Getter và Setter cho x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Getter và Setter cho y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
