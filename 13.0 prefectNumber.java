import java.util.Scanner;

public class PerfectNumber {
   public static boolean isPerfect(int number) {

      int sum_of_factors = 0;

      for(int i=1; i<= number/2; i++)
          if(number%i == 0)
          
             sum_of_factors += i; 

      if (sum_of_factors == number)
          return true; // perfect number

      return false; // not a perfect number
   }

   public static void main(String[] args) {

      int number = 0;
      boolean result = false;

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter an integer number:: ");
      number = scan.nextInt();
        result = isPerfect(number);
      if(result)
          System.out.println(number +
                  " is a perfect number.");
      else
          System.out.println(number +
                  " is not a perfect number");

      scan.close();
   }
}
