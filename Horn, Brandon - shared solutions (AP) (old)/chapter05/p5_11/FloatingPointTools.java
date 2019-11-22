package p5_11;

public class FloatingPointTools
{
	public static boolean sameWhenRounded(double one, double two)
	{
		return (int) Math.round(one * 100.0) == (int) Math.round(two * 100.0);
	}
	
	public static boolean differByLess(double one, double two)
	{
		final double TOLERANCE = 0.01;
		return Math.abs(one - two) < TOLERANCE;
	}
}