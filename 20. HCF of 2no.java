import java.util.Scanner;

public class HCFProgram {

   public static int findHCF(int num1, int num2){


      int hcf = 0;
      int i = 1;

      while(i<=num1 && i<=num2) {
         if(num1%i==0 && num2%i==0)
            hcf = i;
            i++;
      }

      return hcf;
   }

   public static void main(String[] args) {

 
      int number1 = 0;
      int number2 = 0;
      int hcf = 0;


      Scanner scan = new Scanner(System.in);


      System.out.print("Enter two integer numbers::");
      number1 = scan.nextInt();
      number2 = scan.nextInt();

           hcf = findHCF(number1, number2);

           System.out.println("HCF(" + number1
            + "," + number2 + ") = " + hcf );

  
   }
}
