
public class Inhertence {

	public static void main(String[] args) 
	{
		child c=new child();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		c.cal();

	}

}

class parent
{
	int z;

	parent(int x,int y)
	{
		x=10;y=5;
		z=x+y;
		System.out.println("hello");
	}
	public void method1()
	{
		System.out.println("m1");
	}
	public void method2()
	{
		System.out.println("m2");
	}
}
class child extends parent
{
	child()
	{
		super(0, 0);
		System.out.println("hii");
	}
	public void method3()
	{
		System.out.println("m3");
	}
	public void method4()
	{
		System.out.println("m4");
	}
	public void cal()
	{
		System.out.println(z);
	}
	
}
