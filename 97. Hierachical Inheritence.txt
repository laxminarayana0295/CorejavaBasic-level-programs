package oopsconcept;

public class Hierachical {

	public static void main(String[] args)
	{
		c1 cc=new c1();
		c2 ccc=new c2();

	}
}
class parent
{
	parent()
	{
		System.out.println("pp");
	}
}
class c1 extends parent
{
	c1(){
		System.out.println("c1");
	}
}
class c2 extends parent
{
	c2(){
		System.out.println("c2");
	}
}
