package a_2006_2;

public abstract class TaxableItem implements Item
{
    private double taxRate;
    
    public TaxableItem(double rate)
    {
        taxRate = rate;
    }
    
    public abstract double getListPrice();
    
	// canonical solution
	public double purchasePrice()
	{
		return (1 + taxRate) * getListPrice();
	}
}
