public class Overriding {

	public static void main(String[] args){
		
           cc c= new cc();
           c.m1();
	}

}
class pp
{
	public void m1()
	{
		System.out.println("im in parent");
	}
}
class cc extends pp
{
	public void m1()
	{
		System.out.println("im in child");
	}
	public void m1(int a)
	{
		System.out.println("im in child");
	}
	
}
