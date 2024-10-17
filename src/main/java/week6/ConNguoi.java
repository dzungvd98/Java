package week6;
import java.util.Scanner;

// Lớp ConNguoi
class ConNguoi {
    protected String hoTen;
    protected int namSinh;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = sc.nextInt();
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
    }
}

// Lớp HocVien kế thừa ConNguoi
class HocVien extends ConNguoi {
    private double diem1, diem2, diem3;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem 1: ");
        diem1 = sc.nextDouble();
        System.out.println("Nhap diem 2: ");
        diem2 = sc.nextDouble();
        System.out.println("Nhap diem 3: ");
        diem3 = sc.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Diem 1: " + diem1);
        System.out.println("Diem 2: " + diem2);
        System.out.println("Diem 3: " + diem3);
    }
}

// Lớp PhongBanKhoa
class PhongBanKhoa {
    private String maPBK;
    private String tenPBK;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma PBK: ");
        maPBK = sc.nextLine();
        System.out.println("Nhap ten PBK: ");
        tenPBK = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma PBK: " + maPBK);
        System.out.println("Ten PBK: " + tenPBK);
    }
}

// Lớp NhanVien kế thừa ConNguoi
class NhanVien extends ConNguoi {
    private double luong;
    private String ngayNhanViec;
    private PhongBanKhoa pbk;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong: ");
        luong = sc.nextDouble();
        sc.nextLine();  // Đọc bỏ newline
        System.out.println("Nhap ngay nhan viec: ");
        ngayNhanViec = sc.nextLine();
        pbk = new PhongBanKhoa();
        pbk.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong: " + luong);
        System.out.println("Ngay nhan viec: " + ngayNhanViec);
        pbk.xuat();
    }
}


