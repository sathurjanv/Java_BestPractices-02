package sgic_Assignments02;
import java.util.Scanner;
import java.util.Arrays;

public class Q9_Remove_Whitespaces {

	
	
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter the Text: ");
    	String textValue = scanner.nextLine();

      String wordWithoutSpace = textValue.replaceAll("\\s+", "");
      System.out.println("String Value Without Space: " + wordWithoutSpace);
    }
  }
