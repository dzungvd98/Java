package week4;

public class PhuongTrinhBacNhat {
    private int a;
    private int b;

    // Constructor khong tham so (default constructor)
    public PhuongTrinhBacNhat() {
        this.a = 0;
        this.b = 0;
    }

    // Constructor co tham so (constructor copy)
    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Setters va Getters
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // Phuong thuc toString de mo ta doi tuong
    @Override
    public String toString() {
        return "Phuong trinh bac nhat: " + a + "x + " + b + " = 0";
    }

    // Phuong thuc giai phuong trinh bac nhat
    public void giaiPT() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double nghiem = (double) -b / a;
            System.out.println("Phuong trinh co nghiem x = " + nghiem);
        }
    }
}
