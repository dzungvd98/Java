package week4;

public class HCN {
    private int chieuDai;
    private int chieuRong;

    public HCN() {
        this.chieuDai = 1;
        this.chieuRong = 1;
    }


    public HCN(int canh) {
        this.chieuDai = canh;
        this.chieuRong = canh;
    }


    public HCN(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }


    public int tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }


    public int tinhDienTich() {
        return chieuDai * chieuRong;
    }


    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }


    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }


    public void xuatHCN() {
        System.out.printf("Chieu dai: %d, Chieu rong: %d, Chu vi: %d, Dien tich: %d\n",
                chieuDai, chieuRong, tinhChuVi(), tinhDienTich());
    }
}
