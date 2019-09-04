package sgic_Assignments02;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q11_TimeInterval_BetweenTwoTimes {

    public static void timeinterval() {
      //String timeStart = "09:29:58";
      //String timeStop = "15:55:48";
      
      
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the timestart");
      String timeStart= scanner.nextLine();
      
      Scanner scanner2= new Scanner(System.in);
      System.out.println("Enter the timestop ");
      String timeStop= scanner2.nextLine();

      SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

      Date d1 = null;
      Date d2 = null;

      try {
        d1 = format.parse(timeStart);
        d2 = format.parse(timeStop);

        long diff = d2.getTime() - d1.getTime();

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60*1000) % 60;
        long diffHours = diff / (60*60*1000) % 60;

        System.out.println(diffHours + "Hours ");
        System.out.println(diffMinutes + "Minutes ");
        System.out.println(diffSeconds + "Seconds ");
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    
     public static void main(String[] args) {
    	 timeinterval();
    	 timeinterval();
    	 
     }
     }

  
