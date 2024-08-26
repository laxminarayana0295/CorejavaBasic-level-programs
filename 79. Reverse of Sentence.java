import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a sentence: ");
      String sentence = scan.nextLine();
      String reverse = reverse(sentence);
      System.out.println("Reversed sentence: ");
      System.out.println(reverse);
      scan.close();
   }

   public static String reverse(String string) {
      int i = string.indexOf(" ");
      if (i == -1)
         return string;
      return reverse(string.substring(i + 1)) 
            + " " + string.substring(0, i);
   }
}
