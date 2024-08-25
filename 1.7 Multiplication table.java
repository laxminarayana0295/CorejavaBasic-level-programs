import java.util.Scanner;

public class MultiplicationTable {

   public static void 
          printMultiplicationTable(int number){
      for(int i=1; i<=10; i++)
        System.out.println(number+
           " * "+i+" = "+ number * i);
   }

   public static void main(String[] args) {

      int number = 0;

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter integer number::");
      number = scan.nextInt();

      System.out.println("Multiplication"+
              " table of "+number+" is :: ");
      printMultiplicationTable(number);
   }
}
