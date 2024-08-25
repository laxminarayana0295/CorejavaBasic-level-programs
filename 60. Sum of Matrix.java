public class Matrix
 {
  public static void main(String[] args) 
{

    int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    int sum = matrixSum(a);

    System.out.println("The sum of matrix elements = " + sum);
  }
  public static int matrixSum(int[][] a) 
   {
    int sum = 0;
    for (int[] row : a) {
      for (int element : row) {
     
        sum += element;
      }
    }
    return sum;
  }
}
