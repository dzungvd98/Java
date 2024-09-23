
package week4;
import java.util.Scanner;

public class DemoPTBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tao doi tuong phuong trinh bang constructor mac dinh
        PhuongTrinhBacNhat pt1 = new PhuongTrinhBacNhat();
        System.out.println(pt1.toString());
        pt1.giaiPT();

        // Tao doi tuong phuong trinh bang constructor co tham so
        System.out.print("Nhap he so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap he so b: ");
        int b = sc.nextInt();

        PhuongTrinhBacNhat pt2 = new PhuongTrinhBacNhat(a, b);
        System.out.println(pt2.toString());
        pt2.giaiPT();
    }
}
