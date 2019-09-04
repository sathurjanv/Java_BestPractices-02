package sgic_Assignments02;

import java.util.Scanner;
public class Q27_28 {




class Staff{
	public static String type;
	public static String userId;
	public static String startDate;
	public static String endDate;
	public static String reason;

	Staff(String id){
		userId=id;
		type="staff";
	}

	Staff(){

	}

	public void requestLeave(String sd, String ed, String res){
		startDate=sd;
		endDate=ed;
		reason=res;
	}

	public void printLeave(){
		System.out.println("Start date : "+startDate);
		System.out.println("End date : "+endDate);
		System.out.println("Reason : "+reason);
	}

	public void getStatus(){
		if(startDate != null){
			if(!Manager.getDecision().equals("Your leave is rejected by Manager") && !Hr.getDecision().equals("Your leave is rejected by HR") && !Director.getDecision().equals("Your leave is rejected by Director")) {
				System.out.println(Manager.getDecision());
				System.out.println(Hr.getDecision());
				System.out.println(Director.getDecision());
			}
			else if(Manager.getDecision().equals("Your leave is rejected by Manager")){
				System.out.println(Manager.getDecision());
			}
			else if(Hr.getDecision().equals("Your leave is rejected by HR")){
				System.out.println(Hr.getDecision());
			}
			else{
				System.out.println(Director.getDecision());
			}
		}
		else{
			System.out.println("No any pending leave request!");
		}
	}

	public static void cancelRequest(){
		type="";
		userId="";
		startDate="";
		endDate="";
		reason="";
	}

	public String getType(){
		return type;
	}

	public String getUserId(){
		return userId;
	}

	public String getStartDate(){
		return startDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public String getReason(){
		return reason;
	}
}

class Hr{
	public static String type;
	public static String userId;
	public static String decision="HR Decision Pending";

	Hr(String id){
		userId=id;
		type="HR";
	}

	Hr(){
		type="HR";
	}

	public boolean printLeave(){
		if(Staff.getType() != null && !Staff.getType().equals("")){
			System.out.println("New Leave Request of "+Staff.getType()+" "+Staff.getUserId()+" : ");
			System.out.println("Start date : "+Staff.getStartDate());
			System.out.println("End date : "+Staff.getEndDate());
			System.out.println("Reason : "+Staff.getReason());
			return true;
		}
		else{
			System.out.println("No any new leave request(s)!");
			System.out.println();
			return false;
		}
	}

	public void decisionAccept(){
		decision="Your leave is accepted by HR";
	}

	public void decisionReject(){
		decision="Your leave is rejected by HR";
		Staff.cancelRequest();
	}

	public static String getDecision(){
		return decision;
	}
}

class Manager{
	public static String type;
	public static String userId;
	public static String decision="Manager Decision Pending";

	Manager(String id){
		userId=id;
		type="Manager";
	}

	Manager(){
		type="Manager";
	}

	public boolean printLeave(){
		if(!Hr.getDecision().equals("HR Decision Pending") && Staff.getType() != null && !Staff.getType().equals("")){
			System.out.println("New Leave Request of "+Staff.getType()+" "+Staff.getUserId()+" : ");
			System.out.println("Start date : "+Staff.getStartDate());
			System.out.println("End date : "+Staff.getEndDate());
			System.out.println("Reason : "+Staff.getReason());
			return true;
		}
		else{
			System.out.println("No any new leave request(s)!");
			System.out.println();
			return false;
		}
	}

	public void decisionAccept(){
		decision="Your leave is accepted by Manager";
	}

	public void decisionReject(){
		decision="Your leave is rejected by Manager";
		Staff.cancelRequest();
	}

	public static String getDecision(){
		return decision;
	}
}

class Director{
	public static String type;
	public static String userId;
	public static String decision="Director Decision Pending";

	Director(String id){
		userId=id;
		type="Director";
	}

	Director(){
		type="Director";
	}

	public boolean printLeave(){
		if(!Director.getDecision().equals("Director Decision Pending") && Staff.getType() != null && !Staff.getType().equals("")){
			System.out.println("New Leave Request of "+Staff.getType()+" "+Staff.getUserId()+" : ");
			System.out.println("Start date : "+Staff.getStartDate());
			System.out.println("End date : "+Staff.getEndDate());
			System.out.println("Reason : "+Staff.getReason());
			return true;
		}
		else{
			System.out.println("No any new leave request(s)!");
			System.out.println();
			return false;
		}
	}

	public void decisionAccept(){
		decision="Your leave is accepted by Director";
	}

	public void decisionReject(){
		decision="Your leave is rejected by Director";
		Staff.cancelRequest();
	}

	public static String getDecision(){
		return decision;
	}
}

class q27_28{
	public static void main(String args[]){
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.Staff \n2.HR \n3.Manager \n4.Director \n5.Exit");
			System.out.println();
			System.out.println("Select your user type: ");
			String ss = scanner.nextLine();
				if(Integer.parseInt(ss)==1){
					System.out.println();
					System.out.println("1.Apply Leave \n2.View Status");
					String ss1=scanner.nextLine();
					if(Integer.parseInt(ss1)==1){
						System.out.println("Enter your Staff id : ");
						String st=scanner.nextLine();

						System.out.println("Enter Leave Start Date : ");
						String sdt=scanner.nextLine();

						System.out.println("Enter Leave End Date : ");
						String edt=scanner.nextLine();

						System.out.println("Enter Reason for Leave : ");
						String rl=scanner.nextLine();

						Staff s1 = new Staff(st);
						s1.requestLeave(sdt,edt,rl);
						System.out.println();
						System.out.println("Leave request has been succesfully sent to Manager!");
						s1.printLeave();
						System.out.println();
					}
					else if(Integer.parseInt(ss1)==2){
						Staff s = new Staff();
						s.getStatus();
						System.out.println();
					}
					else{
						System.out.println("Invalid input!");
						System.out.println();
					}
				}
				else if(Integer.parseInt(ss)==2){
					Hr h1 = new Hr();
					if(h1.printLeave()){
						System.out.println();
						System.out.println("1.Accept Leave \n2.Reject Leave");
						String ss2=scanner.nextLine();
						if(Integer.parseInt(ss2)==1){
							h1.decisionAccept();
							System.out.println("Leave request accepted and passed to Director!");
							System.out.println();
						}
						else if(Integer.parseInt(ss2)==2){
							h1.decisionReject();
							System.out.println("Leave request rejected!");
							System.out.println();
						}
						else{
							System.out.println("Invalid input!");
							System.out.println();
						}
					}
				}
				else if(Integer.parseInt(ss)==3){
					Manager m1 = new Manager();
					if(m1.printLeave()){
						System.out.println();
						System.out.println("1.Accept Leave \n2.Reject Leave");
						String ss2=scanner.nextLine();
						if(Integer.parseInt(ss2)==1){
							m1.decisionAccept();
							System.out.println("Leave request accepted and passed to HR!");
							System.out.println();
						}
						else if(Integer.parseInt(ss2)==2){
							m1.decisionReject();
							System.out.println("Leave request rejected!");
							System.out.println();
						}
						else{
							System.out.println("Invalid input!");
							System.out.println();
						}
					}
				}
				else if(Integer.parseInt(ss)==4){
					Director d1 = new Director();
					if(d1.printLeave()){
						System.out.println();
						System.out.println("1.Accept Leave \n2.Reject Leave");
						String ss2=scanner.nextLine();
						if(Integer.parseInt(ss2)==1){
							d1.decisionAccept();
							System.out.println("Leave request accepted!");
							System.out.println();
						}
						else if(Integer.parseInt(ss2)==2){
							d1.decisionReject();
							System.out.println("Leave request rejected!");
							System.out.println();
						}
						else{
							System.out.println("Invalid input!");
							System.out.println();
						}
					}
				}
				else if(Integer.parseInt(ss)==5){
					System.exit(0);
				}
				else{
					System.out.println("Invalid input!");
				}
		}

	}
}


