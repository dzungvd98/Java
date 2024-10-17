package week5;

import java.time.LocalDate;
import java.util.Scanner;

public class HangDienMay extends HangHoa{
    private LocalDate thoiGianBaoHanh;
    private double dienAp;
    private double congSuat;

    public HangDienMay() {
    }

    public HangDienMay(LocalDate thoiGianBaoHanh, double dienAp, double congSuat, String maHang, String tenHang, double gia) {
        super(maHang, tenHang, gia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    public HangDienMay(LocalDate thoiGianBaoHanh, double dienAp, double congSuat, HangHoa hangHoa) {
        super(hangHoa);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }
    
    
    
    public LocalDate getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(LocalDate thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getDienAp() {
        return dienAp;
    }

    public void setDienAp(double dienAp) {
        this.dienAp = dienAp;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
    
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Dien ap: " + this.dienAp);
        System.out.println("Cong suat: " + this.congSuat);
        System.out.println("Thoi gian bao hanh: " + this.thoiGianBaoHanh);
    }
    
    @Override
    public void nhapHang() {
        super.nhapHang();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap dien ap: ");
        this.dienAp = sc.nextDouble();
        System.out.println("Nhap cong suat: ");
        this.congSuat = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap thoi gian bao hanh: ");
        String thoiGianBaoHanh = sc.nextLine();
        LocalDate thoiGianBH = LocalDate.parse(thoiGianBaoHanh);
      
        this.thoiGianBaoHanh = thoiGianBH;
        sc.close();
    }
}
