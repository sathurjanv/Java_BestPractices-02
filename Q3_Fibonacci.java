/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgic_assgnments_02;

import java.util.Scanner;
/**
 *
 * @author SathurjanV
 */
public class Q3_Fibonacci {
    
    public static void main(String[] args) {

        int num, t1 = 1, t2 = 1, i = 1;

        Scanner scanner = new Scanner(System.in);
    		System.out.print("Enter the Number of Times: ");
    		num = scanner.nextInt();

        System.out.print("First " + num + " Fibonacci Numbers: ");

        do {

          System.out.print(t1 + " ");
          int sum = t1 + t2;
          t1 = t2;
          t2 = sum;

          i++;

        } while(i <= num);
    }
}
