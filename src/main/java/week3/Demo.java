
package week3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo();
        p1.nhapPS();
        p1.xuatPS();
        
        PhanSo p2 = new PhanSo(4, 16);
        p2.xuatPS();
        int t, m;
        t = sc.nextInt();
        m = sc.nextInt();
        
        PhanSo p3 = new PhanSo(t, m);
        p3.xuatPS();
        
        PhanSo kq = p1.cong(p3);
        kq.xuatPS();
        
        PhanSo p4 = new PhanSo(kq);
        PhanSo kq2 = p4.nhan(p2);
        kq2.xuatPS();
    }
}
