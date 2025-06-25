import java.util.Scanner;

public class UserInputArray 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size;i++)
		{
			System.out.print("Element entered on: "+i+ " ");
			arr[i] = sc.nextInt();
			
			
		}	
		for(int j=0;j<size;j++)
		{
			System.out.println("Thenentered array is: "+arr[j]);
		}
	}

}
