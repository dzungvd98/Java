
package week4;

import java.util.Scanner;

public class DemoNhanVien {
    public static void main(String[] args) {
        // Tao 3 doi tuong nhan vien bang 3 cach khac nhau
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("NV002", "Tran Van B", 5000, 2.5);
        NhanVien nv3 = new NhanVien(nv2);

        // Nhap thong tin cho nhan vien tu ban phim
        nv1.nhapThongTin();
        System.out.println("Thong tin nhan vien vua nhap: " + nv1);

        // Thay doi ho ten cho nhan vien
        nv1.setHoTen("Nguyen Van A");
        System.out.println("Thong tin sau khi thay doi ho ten: " + nv1);

        // In thong tin cua nhan vien co he so luong cao nhat
        NhanVien nhanVienMax = nv1;
        if (nv2.getHeSoLuong() > nhanVienMax.getHeSoLuong()) nhanVienMax = nv2;
        if (nv3.getHeSoLuong() > nhanVienMax.getHeSoLuong()) nhanVienMax = nv3;

        System.out.println("Nhan vien co he so luong cao nhat: " + nhanVienMax);

        // Nhap danh sach nhan vien
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int soLuong = sc.nextInt();
        sc.nextLine();  // Doc bo ky tu xuong dong sau khi nhap so luong

        NhanVien[] danhSachNhanVien = new NhanVien[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.printf("Nhap thong tin nhan vien thu %d:\n", i + 1);
            danhSachNhanVien[i] = new NhanVien();
            danhSachNhanVien[i].nhapThongTin();
        }

        // In danh sach nhan vien va luong cua tung nhan vien
        System.out.println("Danh sach nhan vien:");
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println(nv);
        }

        // In so luong nhan vien
        NhanVien.inSoLuongNhanVien();
    }
}
