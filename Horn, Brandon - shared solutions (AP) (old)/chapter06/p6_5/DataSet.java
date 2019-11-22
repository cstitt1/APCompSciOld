package p6_5;

public class DataSet
{
	private int count;
	private double sum, sqSum;

	/**
	 * Returns the number of values that have been added.
	 * 
	 * @return the number of values that have been added
	 */
	public int count()
	{
		return count;
	}

	/**
	 * Returns the arithmetic mean of all values that have been added.
	 * 
	 * @return the arithmetic mean of all values that have been added
	 * @throws IllegalStateException
	 *             if no values have been entered
	 */
	public double mean()
	{
		if (count() == 0)
			throw new IllegalStateException("No values have been entered.");

		return sum / count;
	}

	/**
	 * Returns the standard deviation of all values that have been added.
	 * 
	 * @return the standard deviation of all values that have been added
	 * @throws IllegalStateException
	 *             if no values have been entered
	 */
	public double standardDeviation()
	{
		if (count() == 0)
			throw new IllegalStateException("No values have been entered.");

		return Math.pow((sqSum - ((sum * sum) / count)) / (count - 1), 0.5);
	}

	/**
	 * Adds a value to the data set.
	 * 
	 * @param value
	 *            the value to add
	 */
	public void add(double value)
	{
		count++;
		sum += value;
		sqSum += value * value;
	}
}
