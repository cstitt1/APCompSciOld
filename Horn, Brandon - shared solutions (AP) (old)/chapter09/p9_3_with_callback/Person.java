package p9_3_with_callback;

public class Person
{
	private String theName;
	private double theHeight;
	
	public Person(String name, double height)
	{
		theName = name;
		theHeight = height;
	}
	
	public String name()
	{
		return theName;
	}
	
	public double height()
	{
		return theHeight;
	}
}
