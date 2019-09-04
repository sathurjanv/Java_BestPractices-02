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
public class Q7_Count_vowels {
    
    public static void main(String[] args) {

      
        System.out.println("Enter the word");
        Scanner in= new Scanner(System.in);
      char[] a = in.toCharArray();
      int count1 = 0;
      int count2 = 0;

      for(int i=0; i<a.length; i++) {
        if(a[i] == 'a'|| a[i] == 'e'|| a[i] == 'i' ||a[i] == 'o' ||a[i] == 'u' || a[i] == 'A'|| a[i] == 'E'|| a[i] == 'I' ||a[i] == 'O' ||a[i] == 'U'){
           count1++;
        } else {
          count2++;
        }
      }

      System.out.println("TOtal Number of Vowels: " + count1);
      System.out.println("TOtal Number of consonants: " + count2);

    }
  }
