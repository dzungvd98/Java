package week1;

import java.util.Scanner;

class E9_PrintFibonanci {
    
    public static void printFibonacci(int n, int count, int first, int second) {
        if (count < n) {
            System.out.print(first + " ");
            printFibonacci(n, count + 1, second, first + second);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Vui long nhap vao so nguyen duong.");
        } else {
            printFibonacci(n, 0, 0, 1);
        }
    }
}