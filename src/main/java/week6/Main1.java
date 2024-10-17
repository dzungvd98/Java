package week6;

public class Main1 {
    public static void main(String[] args) {
        // Tạo đối tượng học viên và 2 nhân viên
        HocVien hocVien = new HocVien();
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien();

        // Nhập dữ liệu
        System.out.println("Nhap thong tin hoc vien:");
        hocVien.nhap();
        System.out.println("Nhap thong tin nhan vien 1:");
        nv1.nhap();
        System.out.println("Nhap thong tin nhan vien 2:");
        nv2.nhap();

        // Xuất dữ liệu
        System.out.println("\nThong tin hoc vien:");
        hocVien.xuat();
        System.out.println("\nThong tin nhan vien 1:");
        nv1.xuat();
        System.out.println("\nThong tin nhan vien 2:");
        nv2.xuat();
    }
}