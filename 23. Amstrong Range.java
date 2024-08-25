
public class Amstrongrange {
	public static void main(String[] args) {
		int s=100,e=2000,i,x,z,rem,temp=0,factor=0,sum=0;
		for(x=s;x<=e;x++)
		{
			sum=0;
			rem=0;
			temp=0;
			factor=0;
			for(i=x;i>0;i/=10)
			{
				factor++;
			}
			
		  for(z=x;z>0;z/=10)
		  {
		    rem=z%10;
		   temp=(int)(Math.pow(rem,factor));
		   sum=sum+temp;
		   }
		  if(x==sum) {
			System.out.println("a"+sum);
		  }
		}
		}
	}

