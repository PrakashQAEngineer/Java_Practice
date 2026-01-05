package Basic;

public class SingleInheritance extends ParentInheritance
{
	public void getDataSingle()
	{
		System.out.println("This is the single child Inheritance");
	}

	
}


class ParentInheritance
{
	public void parent()
	{
		System.out.println("This is the parent Inheritance");
	}
	
	public static void main(String args[])
	{
		SingleInheritance s1 = new SingleInheritance();
		s1.getDataSingle();
		s1.parent();
		
	}
}
