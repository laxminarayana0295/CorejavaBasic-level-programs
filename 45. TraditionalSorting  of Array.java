public class Traditionalsorting {

	public static void main(String[] args) {
	int a[]= { 9,2,3,4,5,6,78};
	int temp=0;
	for(int x=0;x<a.length;x++)
	{
		for(int y=x+1;y<a.length;y++)
		{
			if(a[x]>a[y])
			{
				temp=a[x];
				a[x]=a[y];
				a[y]=temp;
			}
		}
		
	}
	for(int t:a)
	{
		System.out.print(t+" ");
	}
	}

}
