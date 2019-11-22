package p9_1;

import shared.Measurable;

/**
 * This class models a die that, when cast, lands on a random face.
 */
public class Die implements Measurable
{
	private int sides;
	private int value;

	/**
	 * Constructs a die with a given number of sides.
	 * 
	 * @param s
	 *            the number of sides, e.g. 6 for a normal die
	 */
	public Die(int s)
	{
		sides = s;
		value = -1;
	}

	/**
	 * Simulates a throw of the die
	 * 
	 * @return the face of the die
	 */
	public int cast()
	{
		if(value == -1)
			value = 1 + ((int) (Math.random() * sides));
		
		return value;
	}
	
	public double getMeasure()
	{
		return value;
	}
}