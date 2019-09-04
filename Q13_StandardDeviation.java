package sgic_Assignments02;

public class Q13_StandardDeviation {


    public static void main(String[] args) {

        double[] numArray = {1,2,3,4,5,6,7,8,9,10,12,34,55,32};
        double SD = calculateSD(numArray);

        System.out.format("Standard Deviation = %.6f", SD);

      }

      public static double calculateSD(double numArr[]) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArr.length;

        for(double num : numArr) {
          sum += num;
        }
        double mean = sum/length;

        for(double num : numArr) {
          standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/length);
      }
  }
