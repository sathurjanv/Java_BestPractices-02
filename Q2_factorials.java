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
public class Q2_factorials {

    public static void main(String args[]) {
        int i=1;
        int fact = 1;

        int number;
        
        System.out.print("Enter the number " );
        Scanner scanner = new Scanner(System.in);
        number=scanner.nextInt();
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
