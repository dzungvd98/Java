import java.util.Scanner;

class E6_BinhPhuongLapPhuong {
    public static int BinhPhuong(int n) {
        return n*n;
    }
    
    public static int LapPhuong(int n) {
        return n*n*n;
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap vao so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Binh phuong cua %d la: %d\n", n, BinhPhuong(n));
        System.out.printf("Lap phuong cua %d la: %d", n, LapPhuong(n));
        sc.close(); 
    }
}
