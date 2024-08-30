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
//Tao ma tran MxN trong no moi phan tu la so ngau nhen [0,50] xuat ma tran ra man hinh
public class Exercise4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int maTran[][] = new int[100][100];
        int m, n;
        System.out.print("Nhap vao m: ");
        m = sc.nextInt();
        System.out.print("Nhap vao n: ");
        n = sc.nextInt();
        Random rand = new Random();
        for(int i = 0; i < m; i++) {
            for(int  j = 0; j < n; j++) {
                maTran[i][j] = rand.nextInt(51);
                System.out.print(maTran[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    
  
}
