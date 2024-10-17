package week7;
import java.util.Scanner;

// Lớp trừu tượng NhanVien
abstract class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected String trinhDo;
    protected double luongCB;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma NV: ");
        maNV = sc.nextLine();
        System.out.println("Nhap ten NV: ");
        tenNV = sc.nextLine();
        System.out.println("Nhap trinh do: ");
        trinhDo = sc.nextLine();
        System.out.println("Nhap luong co ban: ");
        luongCB = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ten NV: " + tenNV);
        System.out.println("Trinh do: " + trinhDo);
        System.out.println("Luong co ban: " + luongCB);
    }

    public abstract double tinhLuong();
}



