package sgic_Assignments02;
import java.io.*;

public class Q23_TemperatureRecords {

}




class  TemperaturesRecorded
{
    public static void main(String args[])
    {
            String str;
            double temp[][] = new double[11][32];
            double HighestCityTemp[] = new double[11];
            double LowestCityTemp[] = new double[11];

             HighestCityTemp[0]=0.0;
             LowestCityTemp[0]=0.0;

            try{
                BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("\n=====Finding TOP 10 cities higest and lowest temperature=====\n\n");
                for(int i=1;i<=10;i++)
                {
                            System.out.println("\n\nCITY   :   "+i);
                            for(int j=1;j<=31;j++)
                            {
                                 System.out.print("Temperature on Day : "+j+" For city : "+i+" is : ");
                                 System.out.flush();
                                 str=obj.readLine();
                                 temp[i][j]=Double.parseDouble(str);

                                 if( j==1)                 //Intialization
                                 {
                                      HighestCityTemp[i]=temp[i][j];
                                      LowestCityTemp[i]=temp[i][j];
                                }

                                 if(temp[i][j] > HighestCityTemp[i])
                                 {
                                       HighestCityTemp[i]=temp[i][j];
                                }

                                if(temp[i][j] < LowestCityTemp[i])
                                {
                                     LowestCityTemp[i]=temp[i][j];
                                }

                            }
                        }
                    }
                catch(Exception e)    {}

                        for(int i=1;i<=10;i++) {
                                System.out.println("\n\nHIGHEST TEMPERATURE FOR CITY "+i+"  is  "+HighestCityTemp[i]);
                                System.out.println("LOWEST TEMPERATURE FOR CITY "+i+"  is  "+LowestCityTemp[i]);
                                System.out.println();
                        }
    }
}
