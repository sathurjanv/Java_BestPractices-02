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
public class Q4_MultiplicationTable {
    

  public static void main(String args[]) {
    int n;
    int i;
    int j;

    for(i=1; i<=10; i++) {
      System.out.println("Multiplication Table " + i);
      System.out.println("=================================");
      System.out.println();

      for (j = 1; j <= 10; j++) {
        System.out.println(i + "*" + j + " = " + (i * j));
      }

      System.out.println();

    }

    System.out.println();
    System.out.println("==================================");
    System.out.println("Multiplication Table in while loop");
    System.out.println("==================================");
    System.out.println();

    i = 1;
    j = 1;
    while(i<=10) {
      System.out.println("Multiplication Table " + i);
      System.out.println("=================================");
      System.out.println();
      while(j<=10) {
        System.out.println(i + "*" + j + " = " + (i * j));
        j++;
      }
      System.out.println();
      j = 1;
      i++;
    }

  }
}

