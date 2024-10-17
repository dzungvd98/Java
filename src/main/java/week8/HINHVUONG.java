package week8;

import java.util.Scanner;

// Lớp HINHVUONG
class HINHVUONG implements HINH {
    private float canh;

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh hinh vuong: ");
        canh = sc.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh vuong: canh = " + canh);
    }

    @Override
    public float dienTich() {
        return canh * canh;
    }
}
