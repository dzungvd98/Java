
package week4;


public class DemoTamGiac {
    public static void main(String[] args) {
        // Tao 3 doi tuong tam giac
        TamGiac tg1 = new TamGiac(3, 4, 5);
        TamGiac tg2 = new TamGiac(6, 6, 6);
        TamGiac tg3 = new TamGiac(7, 8, 9);

        // Xuat thong tin cho tung tam giac
        tg1.inThongTinTamGiac();
        tg2.inThongTinTamGiac();
        tg3.inThongTinTamGiac();
    }
}
