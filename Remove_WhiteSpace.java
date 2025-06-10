import java.util.Scanner;

public class Remove_WhiteSpace 
{
	public static void main(String args[])
	{
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string with spaces: ");
		        String inputString = scanner.nextLine();
		        String stringWithoutSpaces = inputString.replaceAll("\\s", "");
		        System.out.println("String without spaces: " + stringWithoutSpaces);
		        scanner.close();
		    }
		
		
	}


