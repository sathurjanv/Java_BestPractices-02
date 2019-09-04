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
public class Q5_PositiveInteger {
    
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
    		System.out.print("Enter the Integer Value: ");
    		number = scanner.nextInt();


        System.out.print("Factors of " + number + " are: ");
        for(int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

