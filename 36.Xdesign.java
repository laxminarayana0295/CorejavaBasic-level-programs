import java.util.Scanner;
public class StarX
{
  public static void main(String[] args) {
   

  Scanner sc=new Scanner(System.in);
	System.out.println("enter odd >=5 number ");
	int size =sc.nextInt();

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (i==j || i+j==size-1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
