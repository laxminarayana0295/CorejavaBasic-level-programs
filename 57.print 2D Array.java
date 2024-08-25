public class DisplayMatrix {

  public static void main(String[] args) {
   
    int matrix[][] = { { 1, 2 }, { 4, 5 }, { 7, 8 } };


    for (int i = 0; i < matrix.length; i++)
	 {
    
      for (int j = 0; j < matrix[0].length; j++)
	 {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println(); 
    }
  }

}
