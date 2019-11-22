package p5_11;

public class ToolTester
{

	public static void main(String[] args)
	{
		double a = 2.0;
		double b = 1.99998;
		
		System.out.println(FloatingPointTools.sameWhenRounded(a, b)); // true
		System.out.println(FloatingPointTools.differByLess(a, b)); // true
		
		a = 0.999;
		b = 0.991;
		
		System.out.println(FloatingPointTools.sameWhenRounded(a, b)); // false
		System.out.println(FloatingPointTools.differByLess(a, b)); // true
		
		a = 15.08;
		b = 15.10;
		
		System.out.println(FloatingPointTools.sameWhenRounded(a, b)); // false
		System.out.println(FloatingPointTools.differByLess(a, b)); // false
	}
}
