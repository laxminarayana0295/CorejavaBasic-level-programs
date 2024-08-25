

public class EvenOddarray {

	public static void main(String[] args) {
		
      
		int []n=new int[] {10,11,12,13,14,15,16,17};
		int f=0,digit=0,t=0;
      for(int x=0;x<n.length;x++)
      {
    	  if(n[x]%2==0)
    	  {
    		  System.out.println(n[x]);
    	  }
    	  
      }
      
      for(int x=0;x<n.length;x++) 
      {
    	  
    	  if(n[x]%2!=0)
    	  {
    		  f++;
    	  }
    	    
      }
     
	System.out.println(f); 
	
	for(int y=0;y<n.length;y++)
	{
		digit=0;
  	  for(int z=1;z<=n[y];z++)
  	  {
  		  
  		 if(n[y]%z==0)
  		 {
  			 digit++;
  		 }
  		 
  	  }
  	  if(digit==2)
  	  {
  		  t++;
  		  System.out.println(n[y]);
  	  }
	}
	System.out.println(t);
	
	}

}
