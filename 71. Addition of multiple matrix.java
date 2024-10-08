import java.util.Arrays;

public class AddofMatrixes {


  public static void main(String[] args) {


    int a[][] = { { 1, 3 }, { 7, 5 } };
    int b[][] = { { 6, 8 }, { 4, 2 } };

    int row = a.length;
    int column = a[0].length;

       int c[][] = new int[row][column];

       c = addMatrix(a, b);

        System.out.println("A = " + Arrays.deepToString(a));
    System.out.println("B = " + Arrays.deepToString(b));
    System.out.println("C = " + Arrays.deepToString(c));
  }
  
   public static int[][] addMatrix(int[][] a, int[][] b) {
    int row = a.length;
    int column = a[0].length;
    
    int sum[][] = new int[row][column];
    
    for(int i=0; i<row; i++) 
	{
     
      for(int j=0; j<column; j++) {
       
        sum[i][j] = a[i][j] + b[i][j];
      }
    }
    
   
    return sum;
  }
}
