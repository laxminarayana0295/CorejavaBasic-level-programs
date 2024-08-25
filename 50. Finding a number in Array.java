public class Findingarray {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter array size");
	int size=sc.nextInt();
	int [] n= new int[size];
	int [] b=new int[n.length];
	boolean y=true;
	System.out.println("enter array values");
	for(int x=0;x<n.length;x++)
	{
		n[x]=sc.nextInt();
	}
	System.out.println("enter requried num to check;");
	int f=sc.nextInt();
	if(true)
	{
	for(int x=0;x<n.length;x++) {
	
	if(n[x]==f)
	{
		System.out.println("element found in the array");
		y=false;
	}
	}
	}
	if(y)
		System.out.println("not found");
	}

}
