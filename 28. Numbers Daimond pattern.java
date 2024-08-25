import java.util.Scanner;

public class HollowDiamond {

   public static void main(String[] args) {
     
      Scanner scan = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter N value:: ");
      n = scan.nextInt();
      printNumberHollowDiamond(n);
   }

   private static void printNumberHollowDiamond(int n) {
      if(n <= 0)
      System.out.println("Enter Positive Number");

    
      int a = 1;

     
      for(int i=1; i <= n; i++) {

     
         for(int j = i; j <= n; j++) {
            System.out.print(" ");
         }

     
         for(int k = 1; k <= 2*i-1; k++) {
            if(k==1 || k==(2*i-1) )
            System.out.print(a);
            else
            System.out.print(" ");
         }

   
         a++;

         System.out.println();
      }


      a = n-1;

   
      for(int i=n-1; i >= 1; i--) {

     
         for(int j=n; j >= i; j--) {
            System.out.print(" ");
         }

       
         for(int k=1; k <= 2*i-1; k++) {
            if(k==1 || k==(2*i-1) )
            System.out.print(a);
            else
            System.out.print(" ");
         }

        
          a--;


         System.out.println();
      }
   }

}
