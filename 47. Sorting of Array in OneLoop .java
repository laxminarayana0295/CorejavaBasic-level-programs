public class Sortinginoneloop {

	public static void main(String[] args) {
		int[]a= {5,4,3,2,1};
		int temp=0;
		for(int y=0;y<a.length-1;y++)
		{
			//System.out.println(y);
			if(a[y]>a[y+1])
			{
				temp=a[y];
				a[y]=a[y+1];
				a[y+1]=temp;
				y=-1;
			}
		}
		for(int t:a)
		{
			System.out.print(t+" ");
		}
		

	}

}
