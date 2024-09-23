package week4;

public class TamGiac {
    private int canh1;
    private int canh2;
    private int canh3;

    // Constructor voi 3 tham so
    public TamGiac(int canh1, int canh2, int canh3) {
        if (kiemTraHopLe(canh1, canh2, canh3)) {
            this.canh1 = canh1;
            this.canh2 = canh2;
            this.canh3 = canh3;
        } else {
            System.out.println("Day khong phai la 3 canh cua tam giac.");
            this.canh1 = this.canh2 = this.canh3 = 0; // Khong hop le
        }
    }

    // Phuong thuc kiem tra tam giac hop le
    private boolean kiemTraHopLe(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Phuong thuc tinh chu vi
    public int tinhChuVi() {
        return canh1 + canh2 + canh3;
    }

    // Phuong thuc tinh dien tich theo cong thuc Heron
    public double tinhDienTich() {
        double p = (canh1 + canh2 + canh3) / 2.0;
        return Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
    }

    // Phuong thuc xac dinh loai tam giac
    public String loaiTamGiac() {
        if (canh1 == canh2 && canh2 == canh3) {
            return "Tam giac deu";
        } else if (canh1 == canh2 || canh1 == canh3 || canh2 == canh3) {
            return "Tam giac can";
        } else if (laTamGiacVuong()) {
            return "Tam giac vuong";
        } else {
            return "Tam giac thuong";
        }
    }

    // Phuong thuc kiem tra tam giac vuong
    private boolean laTamGiacVuong() {
        int a2 = canh1 * canh1;
        int b2 = canh2 * canh2;
        int c2 = canh3 * canh3;
        return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
    }

    // Getter va Setter
    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }
    
    public void inThongTinTamGiac() {
        System.out.println("Chu vi: " + this.tinhChuVi());
        System.out.println("Dien tich: " + this.tinhDienTich());
        System.out.println("Loai tam giac: " + this.loaiTamGiac());
        System.out.println("--------------------------");
    }
}
