package Oops;

public class para_cons 
{
	int id;
	String name;
	para_cons(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Ths id of the student is: "+id);
		System.out.println("The name of the student is: "+name);
	}
	public static void main(String args[])
	{
		para_cons ob1 = new para_cons(1,"Prakash SIngh Rajput");
		ob1.display();
		
		para_cons ob2 = new para_cons(2,"Jyoti SIngh");
		ob2.display();
		
		para_cons ob3 = new para_cons(3,"Jyoti Prakash");
		ob3.display();
	}

}
