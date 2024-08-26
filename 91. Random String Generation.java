import java.util.Random;

public class Main {
   public static void main(String[] args) {
      String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

      StringBuilder strbuilder = new StringBuilder();
      Random rand = new Random();
      int length = 9;

      for (int i = 0; i < length; i++) {
         int index = rand.nextInt(string.length());
         char randomChar = string.charAt(index);
         strbuilder.append(randomChar);
      }

      String randomString = strbuilder.toString();
      System.out.println("Random String is: " + randomString);
   }
}
