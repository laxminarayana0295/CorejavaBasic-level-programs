class palindrome
{
  public static void main(String args[])
{
	int p=1243,x,rem=0,rev=0;
   for(x=p;x>0;x/=10)
	 {
           rem=x%10;
           rev=rev*10+rem;  
          }
          if(rev==p){
              System.out.println("it is a palindrome  "+p);
            }
         else
   	  {
          System.out.println("it is not a palindrome  "+p);  
           }
}
}
