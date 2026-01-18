package Basic;


class encap2
{
	private String str;
	
	public void setString(String str)
	{
	    this.str = str;	
	}
	
	public String getString()
	{
		return str;
	}
}
public class encapsulation2 
{
	public static void main(String args[])
	{
		encap2 en2 = new encap2();
		en2.setString("Prakash Singh Rajput");
		String str = en2.getString();
		System.out.println(str);
	}

}
