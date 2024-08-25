import java.util.Arrays;
import java.util.Scanner;

public class DisplayMatrix {

  public static void main(String[] args) {
    
    int matrix[][] = null ;
    matrix = new int[3][3];
    Scanner scan = new Scanner(System.in);
  
    System.out.println("Enter 3x3 Matrix elements: ");
    for(int i=0; i<3; i++) {
      for(int j=0; j<3; j++) {
        matrix[i][j] = scan.nextInt();
      }
    }
    System.out.println("Entered Matrix: ");
    System.out.println(Arrays.deepToString(matrix)); 
    

  }
