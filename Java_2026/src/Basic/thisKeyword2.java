package Basic;



class ThisExample
{
	void display()
	{
		System.out.println("this is the display Method");
	}
	
	void show()
	{
		System.out.println("this is the show method");
		this.display();     //by default compiler add this method to diplay we we dont give the this keyword
	}
}
public class thisKeyword2 
{
	public static void main(String args[])
	{
		ThisExample t2 = new ThisExample();
		t2.show();
		
	}

}
