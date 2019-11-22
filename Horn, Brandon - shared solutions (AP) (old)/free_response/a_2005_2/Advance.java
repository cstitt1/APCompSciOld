package a_2005_2;

public class Advance extends Ticket
{
	private double price;
	
	public Advance(int numDays)
	{
		super();
		
		if(numDays >= 10)
			price = 30.0;
		else
			price = 40.0;
	}
	
	public double getPrice()
	{
		return price;
	}
}
