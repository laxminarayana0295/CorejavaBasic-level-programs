import java.util.Scanner;

public class PascalTriangle {

   public static void main(String[] args) {
    
      Scanner scan = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter Number of Rows:: ");
      n = scan.nextInt();
      displayPascalTriangle(n);
      scan.close();
   }

   private static void displayPascalTriangle(int n) {
     
      int a = 0;

     
      if(n <= 0)
      System.out.println("Enter Positive Number");

      for(int i=1; i <= n; i++) {
        
         a = 1;

        
         for(int j = 1; j <= i; j++) {
            System.out.print(a + " ");
          
            a = a * (i-j) / j;
         }

      
         System.out.println();
      }
   }
}
