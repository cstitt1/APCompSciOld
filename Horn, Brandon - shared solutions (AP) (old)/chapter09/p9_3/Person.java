package p9_3;

import shared.Measurable;

public class Person implements Measurable
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
	
	public double getMeasure()
	{
		return height();
	}
}
