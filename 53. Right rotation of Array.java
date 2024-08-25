

public class Rightrotationarray {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9};
		int r=3;
		for(int x =1;x<=r;x++)
		{
			int t=a[a.length-1];
			for(int y=a.length-1;y>0;y--)
			{
				a[y]=a[y-1];
			}
			a[0]=t;
		}
		for(int z:a)
		{
			System.out.print(z+" ");
		}
		
	}

}
