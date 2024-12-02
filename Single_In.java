package Oops;


class sinin
{
	void call()
	{
		System.out.println("this is the calling methiod");
	}
	void run()
	{
		System.out.println("This is the running method");
	}
}
public class Single_In extends sinin
{
  public static void main(String args[])
  {
	  Single_In ob1 = new Single_In();
	  ob1.call();
	  ob1.run();
  }
}
