

public class Negativesideandpositive {

	public static void main(String[] args) {
		int []a= {-1,-7,-6,2,9,-2,4,0,8};
		
		int temp=0,count=0;
		
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<0)
			{
				temp++;
			}
			if(a[x]>=0)
			{
				count++;
			}
		}
		System.out.println(temp);
		int[]b=new int[temp];
		int []c=new int[count];
		for(int x=0,y=0,z=0;x<a.length;x++)
		{
			if(a[x]<0)
			{
				b[y]=a[x];
				y++;
			}
			if(a[x]>=0)
			{
				c[z]=a[x];
				z++;
			}
		}
		
	    for(int x=0,y=0,z=temp,i=0;x<temp;x++,z++,y++,i++)
		{
			a[x]=b[y];
			a[z]=c[i];
		}
        for(int t:a)
        {
        	System.out.print(t+" ");
        }
	}

}
