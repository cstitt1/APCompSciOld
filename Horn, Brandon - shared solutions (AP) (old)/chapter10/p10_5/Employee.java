package p10_5;

public class Employee
{
	private String name;
	private double salary;
	
	public Employee(String eName, double eSalary)
	{
		name = eName;
		salary = eSalary;
	}
	
	public String name()
	{
		return name;
	}
	
	public double salary()
	{
		return salary;
	}
	
	public String toString()
	{
		return name() + " earns $" + salary();
	}
}
