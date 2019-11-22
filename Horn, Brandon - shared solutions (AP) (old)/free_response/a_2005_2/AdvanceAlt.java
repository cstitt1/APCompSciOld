package a_2005_2;

public class AdvanceAlt extends Ticket
{
	private int daysInAdvance;
	
	public AdvanceAlt(int numDays)
	{
		super();
		daysInAdvance = numDays;
	}
	
	public double getPrice()
	{
		if(daysInAdvance >= 10)
			return 30.0;
		else
			return 40.0;
	}
}
