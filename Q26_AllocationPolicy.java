package sgic_Assignments02;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class Q26_AllocationPolicy {


	public static void main(String args[]) throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the joined date : ");
		String date = scanner.nextLine();

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date joinedDate = format.parse(date);
		//Date today = new Date();
		LocalDate jd = joinedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		//LocalDate td = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		//Period p = Period.between(jd, td);
		//int year = p.getYears();
		int month = jd.getMonthValue();

			if(month==1 || month==2 || month==3){
				System.out.println("You have 10 days annual leave allocation!");
			}
			else if(month==4 || month==5 || month==6){
				System.out.println("You have 7 days annual leave allocation!");
			}
			else if(month==7 || month==8 || month==9){
				System.out.println("You have 3 days annual leave allocation!");
			}
			else if(month==10 || month==11 || month==12){
				System.out.println("You have no annual leave allocation!");
			}
	}
}


































