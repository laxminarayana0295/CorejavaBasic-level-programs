public class MultipleInheritence 
{
	public static void main(String [] args)
	{
		Child child= new Child();
		 child.m1();
		 child.m2();
		
	}
}
interface father{
	public void m1();
	
}
interface Mother{
	public void m2();
	
}
class Child implements father,Mother
{

	@Override
	public void m2() 
	{
		System.out.println("hi son ");
		
	}

	@Override
	public void m1() 
	{
		System.out.println("hii beta");
		
	}
	
}
