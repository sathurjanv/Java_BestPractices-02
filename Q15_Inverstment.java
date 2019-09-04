package sgic_Assignments02;
import java.io.*;

public class Q15_Inverstment {



    public static void main(String args[])
    {
          String str;
          int p=1000;     //Intial Principal Amountfloat r=0.10f;  //Intial Interest Rateint n=0;
          double CI=0.0;
          int n = 0;
          float r = 0;

          try{
                BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter Number of yrs : ");
                System.out.flush();
                str=obj.readLine();
                n=Integer.parseInt(str);
            }
            catch(Exception e){}

             System.out.println("\n=====COMPOUND INTEREST CALCULATION=====");

             System.out.print("Principal Amount : ");
             System.out.flush();
            for(int i=1;i<=n;i++)
            {
                System.out.print("      "+p);
                p=p+1000;
              }

            System.out.print("\nInterest Rate    : ");
            System.out.flush();
            for(int i=1;i<=n;i++)
            {
                   System.out.print("      "+r);
                   r=r+0.01f;
            }

            System.out.println("\nNo. of yrs ");
            for(int i=1;i<=n;i++)
            {
                    System.out.print("       "+i+"            ");
                    System.out.flush();
                    for(int j=1;j<=n;j++)
                    {
                        CI=p*Math.pow(1+r,n);
                        CI=Math.floor(CI);
                        System.out.print("   "+CI);
                        p=p+1000;
                        r=r+0.01f;
                    }
                    System.out.println();
            }




    }
}
