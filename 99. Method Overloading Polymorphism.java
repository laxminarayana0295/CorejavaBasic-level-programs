public class Overloading {

	public static void main(String[] args) {
		 student s=new student();
		  s.m1(10,'a');
		  tech t=new tech();
		 

	}

}
class student
{
	public void m1()
	{
	 System.out.println("deff");	
	}
	public void m1(int a)
	{
	 System.out.println("int a");	
	}
	public void m1(char a)
	{
	 System.out.println("char a");	
	}
	public void m1(int a,char b)
	{
	 System.out.println("deddd");	
	}
}
class tech
{
	tech()
	{
	 System.out.println("deff");	
	}
	tech(int a)
	{
	 System.out.println("int a");	
	}
	tech(char a)
	{
	 System.out.println("char a");	
	}
	tech(int a,char b)
	{
	 System.out.println("deddd");	
	}
}
