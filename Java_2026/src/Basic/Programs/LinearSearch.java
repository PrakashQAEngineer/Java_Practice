package Programs;

import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String args[])
	{
		int arr[] = {10,20,30,40,50,60,70,100,101,33,88,54};
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter the number for search: ");
		 int search = sc.nextInt();
		 boolean status = false;
		 for(int i=0;i<arr.length; i++)
		 {
			 if(arr[i] == search)
			 {
				 System.out.println("Element Found !");
				 status = true;
				 break;
			 }
		 }
		 
		 if(status==false)
			 System.out.println("Element Not Found !");
	}

}
