package p3_5;

/**
 * A car has fuel and a fuel economy. The amount of fuel can be changed by driving or by adding gas.
 */
public class Car
{
	private final double mpg; // fuel efficiency (miles/gallon)
	private double fuel; // in gallons

	/**
	 * Constructs a car with the specified fuel economy and no fuel.
	 * 
	 * @param fuelEfficiency
	 *            the car's fuel efficiency in miles per gallon
	 */
	public Car(double fuelEfficiency)
	{
		mpg = fuelEfficiency;
		fuel = 0;
	}

	/**
	 * Returns the amount of fuel in the car.
	 * 
	 * @return the amount of fuel in gallons
	 */
	public double checkFuel()
	{
		return fuel;
	}

	/**
	 * Simulates driving this car for the specified miles. (Precondition: the car has sufficient fuel)
	 * 
	 * @param miles
	 *            the miles the car is to be driven
	 */
	public void drive(double miles)
	{
		double fuelUsed = miles / mpg;
		fuel -= fuelUsed;
	}

	/**
	 * Adds the specified amount of fuel. (Precondition: gal > 0)
	 * 
	 * @param gal
	 *            the number of gallons of fuel to add
	 */
	public void addGas(double gal)
	{
		fuel += gal;
	}
}
