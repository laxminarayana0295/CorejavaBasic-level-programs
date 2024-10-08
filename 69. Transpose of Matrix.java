import java.util.Arrays;

public class Matrix {

 
  public static void main(String[] args) {


    int a[][] = { { 1, 2 }, { 8, 9 } };


    int row = a.length;
    int column = a[0].length;

   
    int transpose[][] = new int[row][column];


    transpose = transposeMatrix(a);

    
    System.out.println("A = " + Arrays.deepToString(a));
    System.out.println("Transpose = " + 
                     Arrays.deepToString(transpose));
  }


  public static int[][] transposeMatrix(int[][] a) {


    int row = a.length;
    int column = a[0].length;


    int temp[][] = new int[row][column];


    for (int i = 0; i < row; i++) {
     
      for (int j = 0; j < column; j++) {
      
        temp[i][j] = a[j][i];
      }
    }


    return temp;
  }

}
