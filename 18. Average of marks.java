import java.util.Scanner;
class Average
{
   public static void main(String arg[])
	
    {
	
       int n;double res=0;
	
       Scanner sc=new Scanner(System.in);
 
       System.out.println("enter  numbers of subjects to call avg");
	   
       n=sc.nextInt();
 
       int a[]=new int[n];
 
       System.out.println("enter   "+n+" subject marks");
 
       for(int i=0;i<n;i++)
	   a[i]=sc.nextInt();
 
       for(int i=0;i<n;i++)
	   res =res+a[i];
 	 	    
        System.out.println("average="+res/n);
 
    }
 
}
