public class Main {
   public static void main(String[] args) {
      String string = "Know Program";
      System.out.println("Given String: " + string);
      int k = 0;
      char temp = 0;
      char[] chars = string.toCharArray();
      for (int i = 0; i < chars.length; i++) {
         for (k = 0; k < chars.length; k++) {
            if (chars[k] > chars[i]) {
               temp = chars[i];
               chars[i] = chars[k];
               chars[k] = temp;
            }
         }
      }
      String sortedString = new String(chars);
      System.out.println("Sorted String: " + sortedString);
   }
}
