package a_2005_2;

public class StudentAdvance extends Advance
{
	public StudentAdvance(int numDays)
	{
		super(numDays);
	}
	
	public double getPrice()
	{
		return super.getPrice() / 2;
	}
	
	public String toString()
	{
		return super.toString() + "\n(student ID required)";
	}
}
