/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgic_assgnments_02;

/**
 *
 * @author SathurjanV
 */
public class Q1_ReverseDigits {
 
    public static void main(String[] args) {
                int num = 12345, reversed = 0;
                while(num != 0) {
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    num /= 10;
                }
                System.out.println("Reversed Number: " + reversed);
                    
    }
}