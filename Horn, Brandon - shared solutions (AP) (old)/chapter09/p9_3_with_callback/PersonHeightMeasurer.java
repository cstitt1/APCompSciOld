package p9_3_with_callback;

import shared.Measurer;

/**
 * Measures Person objects by height
 */
public class PersonHeightMeasurer implements Measurer<Person>
{
	public double measure(Person p)
	{
		return p.height();
	}
}
