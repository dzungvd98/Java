/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package week1;

import java.util.Scanner;

/**
 *
 * @author Dung Vu
 */
public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String hoTen = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println("This is my first java program");
        System.out.println("Hello! I'm " + hoTen + ".");
        System.out.println("I'm " + age + " years old.");
    }
}
