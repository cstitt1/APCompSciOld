package shared;

/**
 * Computes the average of a set of data values.
 */
public class DataSet_9_4<T>
{
	private double sum;
	private T maximum;
	private int count;
	private Measurer<T> measurer;

	/**
	 * Constructs an empty data set with a given measurer.
	 * 
	 * @param aMeasurer
	 *            the measurer that is used to measure data values
	 */
	public DataSet_9_4(Measurer<T> aMeasurer)
	{
		sum = 0;
		count = 0;
		maximum = null;
		measurer = aMeasurer;
	}

	/**
	 * Adds a data value to the data set.
	 * 
	 * @param x
	 *            a data value
	 */
	public void add(T x)
	{
		sum = sum + measurer.measure(x);
		if (count == 0 || measurer.measure(maximum) < measurer.measure(x))
			maximum = x;
		count++;
	}

	/**
	 * Gets the average of the added data.
	 * 
	 * @return the average or 0 if no data has been added
	 */
	public double getAverage()
	{
		if (count == 0)
			return 0;
		else
			return sum / count;
	}

	/**
	 * Gets the largest of the added data.
	 * 
	 * @return the maximum or 0 if no data has been added
	 */
	public T getMaximum()
	{
		return maximum;
	}
}