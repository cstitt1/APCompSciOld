package p4_18;

public class Easter
{
	private int month, day;

	/**
	 * Constructor for objects of class Easter
	 */
	public Easter(int y)
	{
		int a, b, c, d, e, g, h, j, k, m, r, n, p;

		a = y % 19;
		b = y / 100;
		c = y % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) % 30;
		j = c / 4;
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32;

		month = n;
		day = p;

	}

	/**
	 * Returns the month
	 * 
	 * @return the month
	 */
	public int getEasterSundayMonth()
	{
		return month;
	}

	/**
	 * Returns the day
	 * 
	 * @return the day
	 */
	public int getEasterSundayDay()
	{
		return day;
	}
}
