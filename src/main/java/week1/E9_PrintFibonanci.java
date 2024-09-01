import java.util.Scanner;

class Fibonaci {
    
    public static void E9_PrintFibonanci(int n, int count, int first, int second) {
        if(count < n) {
            System.out.print(first + " ");
            printFibonanci(n, count+1, second,first + second);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.print("Nhap vao so n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonanci(n,0,0,1);
    }
}