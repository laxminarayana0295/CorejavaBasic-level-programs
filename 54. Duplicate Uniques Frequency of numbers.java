

public class Duplicateanduniquelogic {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,1,2,3,4,5,6,7,5,22,33,6,54};
		boolean []b= new boolean[a.length];
		int count=1;
		for(int x=0;x<a.length;x++)
		{
			if(b[x]==true)
				continue;
			
			count=1;
			for(int y=x+1;y<a.length;y++)
			{
				if (a[x]==a[y])
				{
					count++;
					b[y]=true;
				}
			}
			if(count>1)
			{
				System.out.println(a[x]+" --"+count);
				
			}
			
			if(count==1)
			{
				System.out.println(a[x]);
			}
			
			System.out.println(a[x]);
		}

	}

}
