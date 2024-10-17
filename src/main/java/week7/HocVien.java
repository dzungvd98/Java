package week7;

import java.util.ArrayList;
import java.util.List;

class HocVien {
    private List<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void themNhanVien(NhanVien nv) {
        danhSachNhanVien.add(nv);
    }

    public double tinhTongLuong() {
        double tongLuong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }

    public void xuatDanhSachNhanVien() {
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
            System.out.println("-----------------------");
        }
    }
}