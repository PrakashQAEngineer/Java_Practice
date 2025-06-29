
public class String_Bubble 
{
	public static void main(String ags[])
	{
		String[] args = {"Prakash", "Jyoti", "Sakshi", "Varun", "Gini", "Cuckee"};
		
		String temp;
		for(int i=0;i<args.length;i++)
		{
			for(int j=0;j<args.length-1-i;j++)
			{
				if(args[j].compareToIgnoreCase(args[j+1])>0)
				{
					temp = args[j];
					args[j] = args[j+1];
					args[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}

}
