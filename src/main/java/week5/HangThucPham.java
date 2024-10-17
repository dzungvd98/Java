package week5;

import java.time.LocalDate;
import java.util.Scanner;

public class HangThucPham extends HangHoa{
    private LocalDate ngaySanSuat;
    private LocalDate ngayHetHan;

    public HangThucPham() {
    }

    public HangThucPham(LocalDate ngaySanSuat, LocalDate ngayHetHan, String maHang, String tenHang, double gia) {
        super(maHang, tenHang, gia);
        this.ngaySanSuat = ngaySanSuat;
        this.ngayHetHan = ngayHetHan;
    }

    public HangThucPham(LocalDate ngaySanSuat, LocalDate ngayHetHan, HangHoa hangHoa) {
        super(hangHoa);
        this.ngaySanSuat = ngaySanSuat;
        this.ngayHetHan = ngayHetHan;
    }

    public LocalDate getNgaySanSuat() {
        return ngaySanSuat;
    }

    public void setNgaySanSuat(LocalDate ngaySanSuat) {
        this.ngaySanSuat = ngaySanSuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
    
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Ngay san xuat: " + this.ngaySanSuat);
        System.out.println("Ngay het han: " + this.ngayHetHan);
    }
    
    @Override
    public void nhapHang() {
        super.nhapHang();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay san xuat: ");
        String ngaySanXuatStr = sc.nextLine();
        LocalDate ngaySanXuat = LocalDate.parse(ngaySanXuatStr);
        
        System.out.println("Nhap ngay het han: ");
        String ngayHetHanStr = sc.nextLine();
        LocalDate ngayHetHan = LocalDate.parse(ngayHetHanStr);
        
        
        this.ngaySanSuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        sc.close();
    }
    
}
