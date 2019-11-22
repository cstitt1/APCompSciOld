package p4_11.goodDesign;

public class Change
{
	private final int dollars, quarters, dimes, nickels, pennies;
	
	public Change(int dollars, int quarters, int dimes, int nickels, int pennies)
	{
		this.dollars = dollars;
		this.quarters = quarters;
		this.dimes = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}
	
	public int dollars()
	{
		return dollars;
	}
	
	public int quarters()
	{
		return quarters;
	}
	
	public int dimes()
	{
		return dimes;
	}
	
	public int nickels()
	{
		return nickels;
	}
	
	public int pennies()
	{
		return pennies;
	}
}
