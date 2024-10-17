package week7;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HocVien hocVien = new HocVien();

        // Nhập dữ liệu cho các nhân viên
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            System.out.println("Chon loai nhan vien (1: Quan ly, 2: Nghien cuu, 3: Phuc vu): ");
            int loaiNV = sc.nextInt();
            NhanVien nv;

            switch (loaiNV) {
                case 1:
                    nv = new NhanVienQuanLy();
                    break;
                case 2:
                    nv = new NhanVienNghienCuu();
                    break;
                case 3:
                    nv = new NhanVienPhucVu();
                    break;
                default:
                    System.out.println("Loai nhan vien khong hop le!");
                    continue;
            }

            nv.nhap();
            hocVien.themNhanVien(nv);
        }

        // Xuất danh sách nhân viên và tính tổng lương
        System.out.println("\nDanh sach nhan vien:");
        hocVien.xuatDanhSachNhanVien();
        System.out.println("Tong luong cua tat ca nhan vien: " + hocVien.tinhTongLuong());
    }
}