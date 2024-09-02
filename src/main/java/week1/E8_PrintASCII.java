/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author Dung Vu
 */
public class E8_PrintASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao do lon mang: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.print("Nhap vao cac phan tu mang: ");
        for(int i = 0;i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            System.out.printf("%c ", nums[i]);
        }
    }
}
