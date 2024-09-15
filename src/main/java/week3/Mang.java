
package week3;

import java.util.List;
import java.util.Scanner;

public class Mang {
    private int soPhanTu;
    private int[] mangPhanTu;

    public Mang() {
        
    }
  
    public int getSoPhanTu() {
        return soPhanTu;
    }

    public void setSoPhanTu(int soPhanTu) {
        this.soPhanTu = soPhanTu;
    }

    public int[] getMangPhanTu() {
        return mangPhanTu;
    }

    public void setMangPhanTu(int[] mangPhanTu) {
        this.mangPhanTu = mangPhanTu;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        this.soPhanTu = sc.nextInt();
        this.mangPhanTu = new int[soPhanTu];
        
        for(int i = 0; i < soPhanTu; i++) {
            System.out.printf("Nhap so phan tu thu %d cua mang: ", i + 1);
            mangPhanTu[i] = sc.nextInt();
        }
    }
    
    public void output() {
        System.out.println("So phan tu: " + soPhanTu);
        System.out.println("Danh sach phan tu: ");
        for(int i = 0; i < soPhanTu; i++) {
            System.out.print(mangPhanTu[i] + " ");
        }
        System.out.println();
    }
    
    public void trungBinhCacSoLe() {
        float tongCacSoLe = 0;
        for(int i = 0; i < soPhanTu; i++) {
            if(mangPhanTu[i] % 2 != 0) {
                tongCacSoLe += mangPhanTu[i];
            }
        }
        float trungBinhCacSoLe = tongCacSoLe/soPhanTu;
        System.out.printf("Trung binh cac so le la: %.2f\n", trungBinhCacSoLe);
    }
    
    public void timPhanTuLonNhat() {
        int max = mangPhanTu[0];
        for(int i = 1; i < soPhanTu; i++) {
            if(mangPhanTu[i] > max) {
                max = mangPhanTu[i];
            }
        }
        System.out.printf("Phan tu lon nhat mang la: %d\n", max);
    }
    
    public void sapXepTangDan(){
        for(int i = 0; i < soPhanTu; i++) {
            int key = mangPhanTu[i];
            int j = i - 1;
            while(j >= 0 && mangPhanTu[j] > key){
                mangPhanTu[j+1] = mangPhanTu[j];
                j--;
            }
            mangPhanTu[j+1] = key;
        }
    }
}
