public class KnowProgram {
  public static void main(String[] args) {

  
    int n = 100;
        System.out.println("Displaying from 1 to 100: ");
    display(n);
  }


  public static void display(int n) {
     if(n > 1)
       display(n-1);
     System.out.print(n+" ");
  }

}
