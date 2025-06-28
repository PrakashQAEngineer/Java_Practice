package InterFacee;

public class Traffic_class implements Traffic, Train_Traffic
{
	
	
	public static void main(String args[])
	{
		
		
		Traffic tc = new Traffic_class();
		tc.redLight();
		tc.greenLight();
		tc.yellowLight();
		
		Traffic_class tb = new Traffic_class();
		tb.walkonSymbol();
		
		Train_Traffic tt = new Traffic_class();
		tt.trainTariff();
		
	}

	@Override
	public void redLight() {
		System.out.println("This is the RedLight");
		
	}

	@Override
	public void greenLight() {
		System.out.println("This is the Green Light");
		
	}

	@Override
	public void yellowLight() {
		System.out.println("This is the Yellow Light");
		
	}
	
	public void walkonSymbol()
	{
		System.out.println("This is the walk on Symbi");	
		}

	@Override
	public void trainTariff() {
		System.out.println("Ths is the traing traffic.......");
		
	}

}
