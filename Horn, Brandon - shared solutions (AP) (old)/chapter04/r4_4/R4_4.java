package r4_4;

public class R4_4
{
	public static void main(String[] args)
	{
		// integer overflow
		System.out.println(1000000000 * 3);
		// prints -1294967296
		
		// rounding error
		double purchases = 0.00;
		purchases += 1.99;
		purchases += 2.49;
		purchases += 0.99;
		System.out.println(purchases);
		// prints 5.470000000000001
	}
}
