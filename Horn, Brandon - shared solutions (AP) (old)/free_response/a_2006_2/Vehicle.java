package a_2006_2;

// canonical solution
public class Vehicle extends TaxableItem
{
	private double dealerCost;
	private double dealerMarkup;

	public Vehicle(double cost, double markup, double rate)
	{
		super(rate);
		dealerCost = cost;
		dealerMarkup = markup;
	}

	public void changeMarkup(double newMarkup)
	{
		dealerMarkup = newMarkup;
	}

	public double getListPrice()
	{
		return dealerCost + dealerMarkup;
	}
}
