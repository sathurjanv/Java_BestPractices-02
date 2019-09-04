package sgic_Assignments02;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q12_BetweenTwoDates {


    public static void main(String[] args) {
      //String dateStart = "01/14/2019 09:29:58";
      //String dateStop = "01/16/2019 10:31:48";
    
    	Scanner a= new Scanner(System.in);
    	System.out.println("Enter Start date");
    	String dateStart= a.nextLine();
    	
    	Scanner b= new Scanner(System.in);
    	System.out.println("Enter the End Date");
    	String dateStop= b.nextLine();
    	
    	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyy HH:mm:ss || MM.dd.yyy HH.mm.ss ");

      Date d1 = null;
      Date d2 = null;

      try {
        d1 = format.parse(dateStart);
        d2 = format.parse(dateStop);

        long diff = d2.getTime() - d1.getTime();

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60*1000) % 60;
        long diffHours = diff / (60*60*1000) % 60;
        long diffDays = diff / (24*60*60*1000);

        System.out.println(diffDays + "Days, ");
        System.out.println(diffHours + "Hours, ");
        System.out.println(diffMinutes + "Minutes, ");
        System.out.println(diffSeconds + "Seconds. ");
      } catch(Exception e) {
        e.printStackTrace();
      }
    }

  }
