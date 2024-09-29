package com.myexercise.vuduydung_k23dtcn269;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Ho ten: Vu Duy Dung
 * MSSV: K23DTCN269 
 * Lop: D23TXCN04-K
 */

public class DanhSachOTo {
    private List<OTo> danhSach;

    public DanhSachOTo() {
        this.danhSach = new ArrayList<>();
    }
    
    public void nhapDanhSachOTo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin moi nhap so luong xe can them vao danh sach: ");
        int soLuong = sc.nextInt();
        while(soLuong > 0) {
            OTo xeMoi = new OTo();
            xeMoi.nhapThongTinOTo();
            danhSach.add(xeMoi);
            soLuong--;
        }
    }
    
    public void inDanhSachOTo() {
        for(int i = 0; i < danhSach.size(); i++) {
            System.out.printf("STT: %d\n", i + 1);
            danhSach.get(i).xuatThongTinOTo();
        }
    }
    
    public void timOToTheoHangSanXuat(String hangSanXuat) {
        int count = 0;
        for(OTo xe : danhSach) {
            if(xe.getHangSanXuat().equals(hangSanXuat)) {
                xe.xuatThongTinOTo();
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Khong tim thay!");
        }
    }
    
    public void sapXepTheoGiaBan() {
        this.danhSach.sort((o1, o2) -> o1.tinhGiaSauThue().compareTo(o2.tinhGiaSauThue()));
        System.out.println("Da sap xep xong!");
    }
    
    
}
