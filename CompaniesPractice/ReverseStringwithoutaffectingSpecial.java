package CompaniesPractice;

public class ReverseStringwithoutaffectingSpecial 
{
	
	
	public static String stringReverse(String str)
	{
		   char[] ct = str.toCharArray();
		   int i=0, j=ct.length-1;
		   
		   while(i<j)
		   {
			   if(!Character.isAlphabetic(ct[i]))
			      i++;
			   
			   else if(!Character.isAlphabetic(ct[j]))
				   j--;
			   
			   else
			   {
				   char temp = ct[i];
				   ct[i] = ct[j];
				   ct[j] = temp;
				   i++;
				   j--;
			   }
		   }
		 //Creates a String object from that array  -new String(ct) — converts the char array back to a String
		return new String(ct);
	}
	public static void main(String args[])
	{
		String input = "abc23def";
		String reversed;
		
		System.out.println("The Original String input is: "+input);
		
	   reversed = stringReverse(input);
	   System.out.println("The reversed String is; "+reversed);
		
	}

}
