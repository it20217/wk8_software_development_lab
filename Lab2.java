/* Write a program that allows a user to enter 5 results for each year of a 4 year course. The app should:
Give an average for each year
Give a total average */

import javax.swing.JOptionPane;
public class Lab2 {
  public static void main(String[] args) {
    
    /**Declare vars */
    int totalSum = 0;
    int yearAvg;
    int totalAvg;
    int resultCount = 5;
    int yearCount = 4;
    int [][] results = new int [yearCount][resultCount];

    for (int i=0; i<yearCount; i++){
      int yearSum = 0;
      for(int j=0; j<resultCount; j++){
        results[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter result:"));
        yearSum += results[i][j]; 
      }
      /** Year average */
      yearAvg = yearSum / resultCount;
      System.out.println("Year "+ (i + 1) +" result: "+yearAvg);
      totalSum +=  yearSum;
    }
    /** Total average */
    totalAvg = totalSum / (resultCount * yearCount);
    System.out.println("Total average result: "+totalAvg);
  }
}
