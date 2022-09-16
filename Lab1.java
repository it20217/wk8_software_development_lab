/* Lab 1
Write a program to print the following grid. */

public class Lab1 {
  public static void main(String[] args) {
    String [][] grid = new String [10][10];

    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        grid[i][j] = "-";
        System.out.print(grid[i][j]);
      }
      System.out.println();
    }
  }
} 