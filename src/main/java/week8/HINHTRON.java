
package week8;

import java.util.Scanner;

class HINHTRON implements HINH {
    private float banKinh;

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh tron: ban kinh = " + banKinh);
    }

    @Override
    public float dienTich() {
        return pi * banKinh * banKinh;
    }
}