import java.util.Scanner;
class primerange
{
public static void main(String args[])
{
      Scanner sc=new Scanner(System.in);
	System.out.println("enter the number ");
	int s=sc.nextInt();
			int x,f=0,j;
  for(x=s-1;x>1;x--)
{ 
   f=0;
  for(j=1;j<=x;j++)
	{
          if(x%j==0)
           {
             f++;
             }
              
}
if(f==2){
                System.out.println(x);
         }
}
	
}
}
