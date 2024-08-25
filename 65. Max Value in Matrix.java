import java.util.Scanner;
import java.util.Arrays;

class Main {
   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number of elements in a row: ");
      int n = scan.nextInt();
      System.out.print("Enter the number of elements in a column: ");
      int m = scan.nextInt();
      int[][] array = new int[n][m];

      if (n == 0 || m == 0) {
         System.out.println("There are no elements in the"+
                            " given 2d array.");
      } else {
         System.out.println("Enter the elements for the 2d array: ");
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               array[i][j] = scan.nextInt();
            }
         }

         System.out.println("2D array = " + 
                             Arrays.deepToString(array));
         System.out.println("The minimum value in the given"+
              " 2d array is: " + getMinimumIn2DArray(array));
      }
      scan.close();
   }

   public static int getMinimumIn2DArray(int[][] number) {
      int minimum = number[0][0];
      for (int j = 0; j < number.length; j++) {
         for (int i = 0; i < number[j].length; i++) {
            if (number[j][i] < minimum) {
               minimum = number[j][i];
            }
         }
      }
      return minimum;
   }
}
