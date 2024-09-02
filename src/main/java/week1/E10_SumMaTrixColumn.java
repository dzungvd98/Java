/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dung Vu
 */
public class E10_SumMaTrixColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Nhap vao kich co m x n cua ma tran!");
        System.out.print("Nhap vao m: ");
        m = sc.nextInt();
        System.out.print("Nhap vao n: ");
        n = sc.nextInt();
        int matrix[][] = new int[m][n];
        Random rd = new Random();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] =  rd.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.print("Nhap vao hang thu K can tinh tong: ");
        int k = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += matrix[k-1][i];
        }
        
        System.out.printf("Tong hang thu %d la: %d", k, sum);
        
    }
}
