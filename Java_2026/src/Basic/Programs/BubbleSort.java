package Programs;

public class BubbleSort 
{
	public static void main(String args[])
	{
		int temp=0;
		int[] args1 = {12,20,22,99,34,1};
		
		for(int i=0;i<args1.length;i++)
		{
		    int flag = 0;
			for(int j=0;j<args1.length-1-i;j++)
			{
				if(args1[j]>args1[j+1])
				{
					temp = args1[j];
					args1[j] = args1[j+1];
					args1[j+1] = temp;
				    flag=1;	
				}
			}
			if(flag==0)
				break;
		}
		
		for(int k=0;k<args1.length;k++)
		{
			System.out.println(args1[k]);
		}
	}

}
