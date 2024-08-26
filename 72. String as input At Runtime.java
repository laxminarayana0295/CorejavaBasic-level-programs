import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

      
        System.out.print("Enter Name: ");
        String name = scan.nextLine();

       
        System.out.println("Entered value: " + name);
        scan.close();
    }

}
