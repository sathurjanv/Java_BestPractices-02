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
public class Q6_alphabet {
    


   public static void main(String args[]){

     System.out.println();
     System.out.println("========================================");
     System.out.println("USING IF ELSE TO FIND VOWEL OR CONSONANT");
     System.out.println("========================================");
     System.out.println();

      System.out.print("Enter a character :");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);

      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
         System.out.println("Given character is an vowel");
      }else {
         System.out.println("Given character is a consonant");
      }

      System.out.println();
      System.out.println("======================================");
      System.out.println("USING SWICH TO FIND VOWEL OR CONSONANT");
      System.out.println("======================================");
      System.out.println();

      System.out.print("Enter a character :");      
      char cha = sc.next().charAt(0);

      switch (cha) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(cha + " is vowel");
                break;
            default:
                System.out.println(cha + " is consonant");
        }

   }
}
