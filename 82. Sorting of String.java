import java.util.Arrays;

public class Main {
   public static String sortString(String string) {
      char charArray[] = string.toCharArray();
      Arrays.sort(charArray);
      return new String(charArray);
   }

   public static void main(String[] args) {
      String string = "Know Program";
      String sortedString = sortString(string);
      System.out.println("Given String: " + string);
      System.out.println("Sorted String: " + sortedString);
   }
}
