

import java.io.*;

public class filehandling {

	public static void main(String[] args) throws IOException 
	{
//		try {
//			FileInputStream fi= new FileInputStream("C:\\Users\\laxma\\OneDrive\\Documents\\fileout.txt");
//			int i=0;
//			while((i=fi.read())!=-1)
//			{
//				System.out.print((char)i);
//				
//			}
//			fi.close();
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			FileOutputStream fi= new FileOutputStream("C:\\Users\\laxma\\OneDrive\\Documents\\fileout.txt");
			 fi.write(65);
			fi.close();
			System.out.println("sucess fullly inserted");
		  } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
