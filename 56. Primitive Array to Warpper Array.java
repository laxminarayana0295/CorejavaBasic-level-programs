import java.util.Arrays;

public class Main {
   public static void main(String args[]) {
      double[] primitiveDoubles = { 1.2, 3.22, 10.33, 4.22, 5.33 };
      Double[] wrappedDoubles = Arrays.stream(primitiveDoubles)
                                      .boxed()
                                      .toArray(Double[]::new);

      System.out.println(primitiveDoubles.getClass().getName());
      System.out.println(wrappedDoubles.getClass().getName());
      System.out.println("Array = " + 
                          Arrays.toString(wrappedDoubles));
   }
}
