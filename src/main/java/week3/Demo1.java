
package week3;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenMoi;
        HocSinh vd = new HocSinh();
        vd.input();
        vd.output();
        vd.rank();
        
        System.out.println("Nhap ho ten moi: ");
        tenMoi = sc.nextLine();
        vd.setHoVaTen(tenMoi);
        
        vd.output();
        HocSinh hs2 = new HocSinh();
        hs2.input();
        if(vd.getDiemTrungBinh() > hs2.getDiemTrungBinh()) {
            System.out.println("Hoc sinh " + vd.getHoVaTen() + " co diem cao hon!");
        } else if(vd.getDiemTrungBinh() < hs2.getDiemTrungBinh()) {
            System.out.println("Hoc sinh " + hs2.getHoVaTen() + " co diem cao hon!");
        } else {
            System.out.println("Hai hoc sinh co diem bang nhau!");
        }
    }
}
