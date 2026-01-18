package Basic;


class encap
{
	private int roll;
	
	public void setter(int roll)
	{
		this.roll = roll;
	}
	
	public int  getter()
	{
		return roll;
	}
}

public class encapsulation1 {

	public static void main(String[] args) 
	{
		encap en = new encap();
		en.setter(20);
		int roll_no = en.getter();
		System.out.println(roll_no);
	
		

	}

}
