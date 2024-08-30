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
// Tim phan tu lon nhat trong mang
public class Exercise3 {
    public static int timPhanTuLonNhat(int mangSo[], int doLonMang) {
        int phanTuLonNhat = mangSo[0];
        for(int i = 1; i < doLonMang; i++) {
            if(phanTuLonNhat < mangSo[i]) {
                phanTuLonNhat = mangSo[i];
            }
        }
        return phanTuLonNhat;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao do lon cua mang: ");
        int n = sc.nextInt();
        int mangSo[] = new int[10];
        for(int i = 0; i < n; i++) {
            mangSo[i] = sc.nextInt();
        }
        
        int soLonNhatTrongMang = timPhanTuLonNhat(mangSo, n);
        System.out.println("So lon nhat trong mang la: " + soLonNhatTrongMang);
    }
}
