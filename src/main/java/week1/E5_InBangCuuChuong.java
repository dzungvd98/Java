import java.util.Scanner;

class E5_InBangCuuChuong {
    public static void main(String[] args) {
        System.out.print("Nhap bang cuu chuong muon in ra: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d", n, i, n * i);
            System.out.println();
        }
        sc.close(); 
    }
}