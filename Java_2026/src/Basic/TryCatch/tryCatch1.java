package TryCatch;

import java.io.FileInputStream;

public class tryCatch1 
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis = new FileInputStream("d:/abc.text");	
		}
		
		catch(Exception e)
		{
			System.out.println("This is the file");	
		}
		
		System.out.println("We Have handled the file");
		
	}

}
