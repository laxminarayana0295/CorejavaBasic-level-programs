// Even Odd Program in Java using For Loop


import java.util.Scanner;

public class OddEvenInRange {

   public static boolean isEvenOdd(int n)
   {
      return (n % 2 != 0) ? true : false;
   }

   public static void main(String[] args) 
{

      int minRange = 0, maxRange = 0;

      boolean result = false;

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter min range:: ");

      minRange = scan.nextInt();

      System.out.print("Enter max range:: ");

      maxRange = scan.nextInt();

      for(int i = minRange; i <= maxRange; i++) {
          result = isEvenOdd(i);
         
          if(result) 
             System.out.print(i+":Even \t");
          else
             System.out.print(i+":Odd \t");
      }

     
      scan.close();
   }
}
