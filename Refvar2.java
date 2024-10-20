package Oops;

public class Refvar2 
{
	public void state()
	{
		System.out.println("Will print all the scroes of the cricketrs: ");
	}
	public static void main(String args[])
	{
		Refvar2 ref = new Refvar2();
		ref.state();
		
		CricketPlayers cp = new CricketPlayers();
		cp.name = "Virat Kohli";
		cp.country = "India";
		cp.match = 89;
		cp.runs = 7783;
		
		CricketPlayers cc = new CricketPlayers();
		cc.name = "Prakash Singh Rajput";
		cc.country = "India";
		cc.match = 66;
		cc.runs = 5566;
		
		System.out.println("The name of the player is: "+cp.name);
		System.out.println("The name of the Country is: "+cp.country);
		System.out.println("The no of match is: "+cp.match);
		System.out.println("The total no of runs are: "+cp.runs);
		
		System.out.println("************************************************************");
		
		System.out.println("The name of the player is: "+cc.name);
		System.out.println("The name of the country is: "+cc.country);
		System.out.println("The no of match is: "+cc.match);
		System.out.println("The total number of runs are: "+cc.runs);
	}

}

class CricketPlayers
{
	String name;
	int runs;
	int match;
	String country;
}