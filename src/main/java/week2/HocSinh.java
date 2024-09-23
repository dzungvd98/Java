package week3;

import java.util.Scanner;

public class HocSinh {
    private String maSo;
    private String hoVaTen;
    private Float diemTrungBinh;
    
    public HocSinh() {
        
    }

    public HocSinh(String maSo, String hoVaTen, Float diemTrungBinh) {
        this.maSo = maSo;
        this.hoVaTen = hoVaTen;
        this.diemTrungBinh = diemTrungBinh;
    }
    
    public HocSinh(HocSinh hs) {
        this.maSo = hs.getMaSo();
        this.hoVaTen = hs.getHoVaTen();
        this.diemTrungBinh = hs.getDiemTrungBinh();
    }
    
    
    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so hoc sinh: ");
        this.maSo = sc.nextLine();
        
        System.out.print("Nhap ho va ten hoc sinh: ");
        this.hoVaTen = sc.nextLine();

        System.out.print("Nhap diem trung binh: ");
        this.diemTrungBinh = sc.nextFloat();
     
    }
    
    public void output() {
        System.out.println("Thong tin hoc sinh: ");
        System.out.printf("Ma so: %s\n", this.maSo);
        System.out.printf("Ho va ten: %s\n", this.hoVaTen);
        System.out.printf("Diem trung binh: %.2f\n", this.diemTrungBinh);
    }
    
    public void rank() {
        if(this.diemTrungBinh < 5) {
            System.out.println("Xep loai yeu");
        } else if(this.diemTrungBinh < 6.5) {
            System.out.println("Xep loai trung binh");
        } else if(this.diemTrungBinh < 8) {
            System.out.println("Xep loai kha");
        } else if(this.diemTrungBinh <= 10) {
            System.out.println("Xep loai gioi");
        }
    }
    
}
