

public class Secondhighest
{

	public static void main(String[] args) 
	{
		int []a= new int[]{19,13,15,3,4,5,11,6,7,8,9,10};
		int max=a[0],max2=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>max)
			{
				max2=max;//a[o]//
				max=a[x];//a[0]
				
			}
			else if(a[x]>max2)//a[1]
			{
				if(a[x]!=max)
				{
					max2=a[x];
				}
			}
			
		}
		
		System.out.println(max2);
		
	}	
			
		
	}


