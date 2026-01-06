package Basic;

class ParentA
{
	public void testA()
	{
		System.out.println("This is the Family of A");
	}
}

class ParentB extends ParentA
{
	public void testB()
	{
		System.out.println("This is the Family of B");
	}
}

public class MultiLevelInheritance extends ParentB
{
	
	public void MultiIn()
	{
		System.out.println("This the the MultiLevel Inheritance Family");
	}
	public static void main(String args[])
	{
		MultiLevelInheritance m1 = new MultiLevelInheritance();
		m1.testB();
		m1.MultiIn();
		m1.testA();	
	}
	

}
