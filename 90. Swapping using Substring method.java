public class Main {
   public static String swap(String string, int i, int j) {
      if (j == string.length() - 1) {
         return string.substring(0, i) + string.charAt(j) + 
                string.substring(i + 1, j) + string.charAt(i);
      }

      return string.substring(0, i) + string.charAt(j) + 
             string.substring(i + 1, j) + string.charAt(i)+ 
             string.substring(j + 1, string.length());
   }

   public static void main(String args[]) {
      String str = "Know Program";
      System.out.println(str);
      System.out.println(swap(str, 0, 5));
   }
}
