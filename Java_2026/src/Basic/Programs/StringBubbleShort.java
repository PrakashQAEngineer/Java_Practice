package Programs;

public class StringBubbleShort 
{
	public static void main(String args[])
	{
	   	String[] str = {"Prakash", "Jyoti", "Usha", "Prabhat", "Shruti"};
	   	String temp;
	   	int flag=0;
	   	for(int i=0;i<str.length;i++)
	   	{
	   		for(int j=0; j<str.length-1-i;j++)
	   		{
	   			if(str[j].compareTo(str[j+1])>0)
	   			{
	   				temp = str[j];
	   				str[j] = str[j+1];
	   				str[j+1] = temp;
	   				flag=1;
	   			}
	   		}
	   		if(flag==0)
	   			break;
	   	}
	   	
	   	for(int k=0;k<str.length;k++)
	   		System.out.println(str[k]);
	   		
	}

}
