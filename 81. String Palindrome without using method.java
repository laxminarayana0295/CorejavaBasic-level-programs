import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String string = scan.nextLine();

      char[] reverse = string.toCharArray();
      int size = reverse.length;
      char[] original = Arrays.copyOf(reverse, size);

      for (int i = 0; i < size / 2; i++) {
         char temp = reverse[i];
         reverse[i] = reverse[size - i - 1];
         reverse[size - i - 1] = temp;
      }

      System.out.println("Original Array: " 
                         + Arrays.toString(original));
      System.out.println("Reverse Array: " 
                         + Arrays.toString(reverse));

      if (Arrays.equals(reverse, original)) {
         System.out.println("Palindrome");
      } else {
         System.out.println("Not a palindrome");
      }
      scan.close();
   }
}
