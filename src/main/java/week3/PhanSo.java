package week3;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;
    
    public PhanSo() {
        this.tuSo = 1;
        this.mauSo = 1;
    }
    
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public PhanSo(PhanSo p) {
        this.tuSo = p.getTuSo();
        this.mauSo = p.getMauSo();
    }
    
    public void nhapPS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap tu so: ");
        int tu = sc.nextInt();
        this.tuSo = tu;
        do {
            System.out.print("Vui long nhap mau so: ");
            this.mauSo = sc.nextInt();
        } while(this.mauSo == 0);
    }
    
    public void xuatPS() {
        this.rutGon();
        System.out.printf("%d/%d\n", this.tuSo, this.mauSo);
    }
    
    public int ucln(int a, int b) {
        while(a != b) {
            if(a > b) a -= b;
            else b -= a;
        }
        return a;
    }
    
    public void rutGon() {
        int uc = ucln(tuSo, mauSo);
        this.tuSo /= uc;
        this.mauSo /= uc;
    }
    
    public PhanSo cong(PhanSo p) {
        PhanSo kq = new PhanSo();
        
        kq.mauSo = this.mauSo * p.mauSo;
        kq.tuSo = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        
        kq.rutGon();
        return kq;
    }
    
    public PhanSo tru(PhanSo p) {
        PhanSo kq = new PhanSo();
        
        kq.mauSo = this.mauSo * p.mauSo;
        kq.tuSo = this.tuSo * p.mauSo - p.tuSo * this.mauSo;
        
        kq.rutGon();
        return kq;
    }
    
    public PhanSo nhan(PhanSo p) {
        PhanSo kq = new PhanSo();
        
        kq.tuSo = this.tuSo * p.tuSo;
        kq.mauSo = this.mauSo * p.mauSo;
        
        kq.rutGon();
        return kq;
    }
    
    public PhanSo chia(PhanSo p) {
        PhanSo kq = new PhanSo();
        
        kq.tuSo = this.tuSo * p.mauSo;
        kq.mauSo = this.mauSo * p.tuSo;
        
        kq.rutGon();
        return kq;
    }
    
    
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
    
}
