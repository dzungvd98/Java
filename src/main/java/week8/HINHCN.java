
package week8;

// Lớp HINHCN

import java.util.Scanner;

class HINHCN implements HINH {
    private float dai;
    private float rong;

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh chu nhat: dai = " + dai + ", rong = " + rong);
    }

    @Override
    public float dienTich() {
        return dai * rong;
    }
}
