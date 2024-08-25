import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

       
       int year = 0;
       boolean result = false;

    
       Scanner scan = new Scanner(System.in);

      
       System.out.print("Enter year:: ");

       year = scan.nextInt();



       if(( year%4==0) && ( (year%400==0) || (year%100!=0) ) )
            result = true;
       else
            result = false;

  

       if(result == true) 
           System.out.println(year+" is a leap year");
       else System.out.println(year+" is not a leap year");




    }
 }
-----------------------------------------------------------------------------
//using year class

import java.time.Year;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        int num = scan.nextInt();
        Year year = Year.of(num);
        if (year.isLeap()) 
          {
             System.out.println(year + " is Leap Year.");
           } 
        else 
          {
            System.out.println(year + " is not a Leap Year.");
          }
        
    }
}
