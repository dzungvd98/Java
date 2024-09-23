package week4;

import java.util.Scanner;

public class DSHCN {
    private HCN[] danhSachHCN;  
    private int soLuong;       

    public DSHCN() {
        this.danhSachHCN = null;
        this.soLuong = 0;
    }

    public void nhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hinh chu nhat: ");
        this.soLuong = sc.nextInt();
        danhSachHCN = new HCN[soLuong];

        for (int i = 0; i < soLuong; i++) {
            System.out.printf("Nhap hinh chu nhat thu %d:\n", i + 1);
            System.out.print("Nhap chieu dai: ");
            int chieuDai = sc.nextInt();
            System.out.print("Nhap chieu rong: ");
            int chieuRong = sc.nextInt();
            danhSachHCN[i] = new HCN(chieuDai, chieuRong);
        }
    }

    // In danh sách hình chữ nhật
    public void inDanhSach() {
        System.out.println("Danh sach hinh chu nhat:");
        for (int i = 0; i < soLuong; i++) {
            System.out.printf("Hinh chu nhat %d: ", i + 1);
            danhSachHCN[i].xuatHCN();
        }
    }
}
