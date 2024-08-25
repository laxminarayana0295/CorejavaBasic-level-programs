public class binaryserch {

	public static void main(String[] args) {
		
		     int [] a={1,2,3,4,5,6,7,8,9,10};
		      int find=7,count=0;
		    int low=0,high=a.length-1,mid=(low+high)/2;
		    for(int x=0;x<a.length;x++)
		      {  
		         count=0; 
		         mid=(low+high)/2;
		        if(a[mid]==find)
			 {
		           count++;
		           break;
			 }
		        else if(a[mid]>find)
		         {
		            high=mid-1;
		          }

		         else if(a[mid]<find)
		           {
		            low=mid+1;
		           }
		         
		      }
		     if(count==1)
			{
		         System.out.println("element found");
			}
		    else
		       {
		         System.out.println("element not found");
			}
		    

	}

}
