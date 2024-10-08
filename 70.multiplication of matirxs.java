import java.util.Arrays;

public class Matrix {

  
  public static void main(String[] args) {

   
    int a[][] = { { 1, 3 }, { 7, 5 } };
    int b[][] = { { 6, 8 }, { 4, 2 } };


    int size = a.length; 

  
    int c[][] = new int[size][size];

    
    c = multiplyMatrix(a, b);


    System.out.println("A = " + Arrays.deepToString(a));
    System.out.println("B = " + Arrays.deepToString(b));
    System.out.println("C (Product) = " + Arrays.deepToString(c));
  }


  public static int[][] multiplyMatrix(int[][] a, int[][] b) {

    
    int size = a.length;

    int product[][] = new int[size][size];

    for (int i = 0; i < size; i++) {
       
      for (int j = 0; j < size; j++) {
       
        product[i][j] = 0;

 
        for (int k = 0; k < size; k++) {
          product[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    return product;
  }

}
