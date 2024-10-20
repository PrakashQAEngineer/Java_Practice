package Oops;
// Initializing object with reference variable
public class RefVar1 
{
	int mathh;
	String name;
	char grade;
	
	
	public static void main(String args[])
	{
		RefVar1 ref = new RefVar1();
		ref.mathh=78;
		ref.name = "Prakash Singh rajput";
		ref.grade = 'A';
		
		System.out.println("The marks in math is: "+ref.mathh);
		System.out.println("The name of the student is: "+ref.name);
		System.out.println("The grade of the Student is: "+ref.grade);
		
	}

}
