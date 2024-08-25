

public class minandmaxArray
 {

	public static void main(String[] args) {
		int [] a= {11,17,7,27,12,14,19,10,1};
		   int min=0,max=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>a[max])
			{
				max=x;
			}
			if(a[x]<a[min])
			{
				min=x;
			}
		}
		System.out.println(a[min]);
		System.out.println(a[max]);
		a[0]=a[0]^a[min];
		a[min]=a[min]^a[0];
		a[0]=a[0]^a[min];
		a[a.length-1]=a[a.length-1]^a[max];
		a[max]=a[max]^a[a.length-1];
		a[a.length-1]=a[a.length-1]^a[max];
		for(int temp:a)
		{
			System.out.print(temp+" ");
		}
	}

}
