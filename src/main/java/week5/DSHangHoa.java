package week5;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DSHangHoa {
    List<HangHoa> danhsach;

    public DSHangHoa() {
        this.danhsach = new ArrayList<>();
    }
    
    public void themHangHoa() {
        Scanner sc = new Scanner(System.in);
        
        int loaiHang;
        
        do { 
            System.out.println("Vui long chon loai hang hoa can nhap: ");
            System.out.println("1.Hang Dien May");
            System.out.println("2.Hang Thuc Pham");
            loaiHang = sc.nextInt();
            switch (loaiHang) {
                case 1:
                    {
                        HangDienMay hangMoi = new HangDienMay();
                        hangMoi.nhapHang();
                        break;
                    }
                case 2:
                    {
                        HangThucPham hangMoi = new HangThucPham();
                        hangMoi.nhapHang();
                        break;
                    }
                default:
                    System.out.println("Loai hang sai vui long nhap lai!");
                    break;
            }
            System.out.println("Them mat hang thanh cong");
        } while (loaiHang <1 && loaiHang >2);
    }
    
    public void xuatDanhSachTheoLoai() {
        System.out.println("Danh sach hang dien may: ");
        int stt = 1;
        for(HangHoa hang : danhsach) {
            if(hang instanceof HangDienMay) {
                System.out.println("STT: " + stt);
                hang.xuatThongTin();
                System.out.println("--------------------");
            }
        }
        
        System.out.println("Danh sach hang thuc pham: ");
        stt = 1;
        for(HangHoa hang : danhsach) {
            if(hang instanceof HangThucPham) {
                System.out.println("STT: " + stt);
                hang.xuatThongTin();
                System.out.println("--------------------");
            }
        }
    }
}
