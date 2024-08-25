public class Bubblesort {

	public static void main(String[] args) {
		int a[]= {5,4,3,2,1};
		int tem=0;
		for(int i=1;i<a.length;i++)
		{
			for(int y=0;y<a.length-i;y++)
			{
			 if(a[y]>a[y+1])
              {
            	  tem=a[y];
            	  a[y]=a[y+1];
            	  a[y+1]=tem;
               }   
			}
		}
		for(int y=0;y<a.length;y++)
		{
			System.out.print(a[y]+" ");
		}

	}

}
