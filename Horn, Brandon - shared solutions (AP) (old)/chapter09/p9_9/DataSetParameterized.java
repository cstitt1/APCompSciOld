package p9_9;

/**
 * Computes the average of a set of data values.
 */
public class DataSetParameterized<T extends Comparable<T>>
{
	private T minimum;
	private T maximum;
	
	/**
	 * Constructs an empty data set.
	 */
	public DataSetParameterized()
	{
		minimum = null;
		maximum = null;
	}

	/**
	 * Adds a data value to the data set.
	 * 
	 * @param x
	 *            a data value
	 */
	public void add(T x)
	{
		if(minimum == null || x.compareTo(minimum) < 0)
			minimum = x;
		
		if(maximum == null || x.compareTo(maximum) > 0)
			maximum = x;
	}

	/**
	 * Gets the largest of the added data.
	 * 
	 * @return the maximum or null if no data has been added
	 */
	public T getMaximum()
	{
		return maximum;
	}
	
	/**
	 * Gets the smallest of the added data.
	 * 
	 * @return the minimum or null if no data has been added
	 */
	public T getMinimum()
	{
		return minimum;
	}
}