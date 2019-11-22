package p10_5;

public class Executive extends Manager
{
	public Executive(String eName, double eSalary)
	{
		super(eName, eSalary, "Corporate");
	}
	
	public String toString()
	{
		return "The Exhaulted Leader " + super.toString();
	}
}
