
package week3;

import java.util.Scanner;

public class DanhSachHocSinh {
    private int soLuong;
    private HocSinh[] danhSach;

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public HocSinh[] getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(HocSinh[] danhSach) {
        this.danhSach = danhSach;
    }
    
    public void NhapDanhSach() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        this.soLuong = sc.nextInt();
        this.danhSach = new HocSinh[soLuong];
        
        for(int i = 0; i < soLuong; i++) {
            danhSach[i] = new HocSinh();
            danhSach[i].input();
        }
    }
    
    public void InDanhSach() {
        System.out.println("Danh sach hoc sinh: ");
        for(int i = 0; i < soLuong; i++) {
            System.out.println("So thu tu " + (i+1));
            danhSach[i].output();
        }
    }
    
    public void SwapHocSinh(HocSinh hs1, HocSinh hs2) {
        HocSinh cmp = hs1;
        hs1 = hs2;
        hs2 = cmp;
    }
    
    public void SapXep() {
        for(int i = 0; i < soLuong; i++) {
            for(int j = i + 1; j < soLuong; j++) {
                if(danhSach[i].getDiemTrungBinh() < danhSach[j].getDiemTrungBinh()) {
                    HocSinh cmp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = cmp;
                }
            }
        }
    }
    
}
