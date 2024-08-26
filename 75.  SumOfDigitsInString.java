import java.util.Scanner;

public class SumOfDigitsInString {

    private static int sumOfdigits(String number) {
       
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
          
            char ch = number.charAt(i);
           
            if (Character.isDigit(ch)) {
            
                int value = Character.getNumericValue(ch);
                
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        System.out.print("Enter String: ");
        String str = scan.next();

 
        int sum = sumOfdigits(str);

        System.out.println("The sum of "
                   + " digits in the string " + str
                   + " = "+ sum);
        scan.close();
    }
}
