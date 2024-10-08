import java.util.Scanner;

public class SumOfDigitsProgram {

   public static int digitSum(int number) {
    
      int lastDigit = 0;
      int sum = 0;

      
      while(number != 0) {

    
         lastDigit = number % 10;

      
         sum = sum + lastDigit;


         number = number / 10;
      }

      return sum;
  }

  public static void main(String[] args) {
    
      int number = 0;
      int sumOfDigits = 0;
      Scanner scan =  new Scanner(System.in);

      System.out.print("Enter an integer number::");
      number = scan.nextInt();

      sumOfDigits = digitSum(number);

      System.out.println("The sum of digits of" +
         " the number "+number+" = "+sumOfDigits);
      scan.close();
  }
}
