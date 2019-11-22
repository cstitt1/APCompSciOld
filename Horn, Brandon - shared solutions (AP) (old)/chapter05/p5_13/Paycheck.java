package p5_13;

public class Paycheck
{
	private String employeeName;
	private double hourlyRate;
	
	/**
	 * 
	 * @param name the employee's name
	 * @param initHourlyRate the employee's hourly rate
	 */
	public Paycheck(String name, double initHourlyRate)
	{
		employeeName = name;
		hourlyRate = initHourlyRate;
	}
	
	/**
	 * 
	 * @param newHourlyRate the employee's new hourly rate
	 */
	public void changeRate(double newHourlyRate)
	{
		hourlyRate = newHourlyRate;
	}
	
	/**
	 * 
	 * @param hours the number of hours the employee worked this week
	 * @return the employee's pay for this week
	 */
	public double computeWeeklyPay(double hours)
	{
		double pay = hourlyRate * hours;
		
		if(hours > 40)
			pay += (hourlyRate / 2) * (hours - 40);
		
		return pay;
	}
	
	/**
	 * TODO 
	 */
	public String toString()
	{
		return employeeName + " @ $" + hourlyRate  + " / hour";
	}
}
