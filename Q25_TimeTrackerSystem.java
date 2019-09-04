package sgic_Assignments02;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q25_TimeTrackerSystem {


	public static void main(String args[]){
		String[][] timeTr = new String[5][4];
		String eid,date,minutes,task;
		int tot=0;
		int j=0;

		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++){
				System.out.println("Please enter the date: ");
				while(true){
					date = scanner.nextLine();
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String today = sdf.format(new Date());

					if(today.equals(date)){
						timeTr[i][j]=date;
						break;
					}
					else{
						System.out.println("Date should be today's date");
					}
				}

				System.out.println("Please enter your Employee Id: ");
				eid = scanner.nextLine();
				++j;
				timeTr[i][j]=eid;

				System.out.println("Please enter the task name: ");
				task = scanner.nextLine();
				++j;
				timeTr[i][j]=task;


				System.out.println("Please enter the working hours in minutes: ");
				int min;

					while(true){
						minutes = scanner.nextLine();
						min=Integer.parseInt(minutes);

						if(min==30 || min==60 || min==90 || min==120){
							for(int k=0; k<i; k++){
								if(i!=0 && timeTr[k][1].equals(eid)){
									tot=tot+Integer.parseInt(timeTr[k][3]);
								}
							}
							tot=tot+min;
							if(tot<=480){
								++j;
								timeTr[i][j]=minutes;
								tot=0;
								break;
							}
							else{
								System.out.println("Working hours should not exceed 8 hours!");
								tot=0;
							}
						}
						else{
							System.out.println("Invalid Input! Please enter a valid minutes from 30/60/90/120 ");
						}
					}

				System.out.println();

			j=0;
		}

		for(int i=0; i<3; i++){
			for(int k=0; k<4; k++){
				System.out.print(timeTr[i][k]+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Enter the date for the task history : ");
		String dt = scanner.nextLine();

			System.out.println("Date\t User Id\t Task\t Minutes");
			for(int k=0; k<3; k++){
				if(timeTr[k][0].equals(dt)){
					System.out.print(timeTr[k][0]+"\t"+timeTr[k][1]+"\t"+timeTr[k][2]+"\t"+timeTr[k][3]);
				}
				System.out.println();
			}
	}
}