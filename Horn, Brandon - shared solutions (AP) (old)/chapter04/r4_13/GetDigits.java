package r4_13;

public class GetDigits
{
	public static void main(String[] args)
	{
		int n = 2564;
		System.out.println("n: " + n);
		System.out.println("f: " + getFirstDigit(n));
		System.out.println("l: " + getLastDigit(n));
		System.out.println("Go Giants");
	}

	private static int getFirstDigit(int number)
	{
	    int numDigitsMinusOne = (int) Math.log10(number);
	    int divisor = (int) Math.pow(10, numDigitsMinusOne);
	    return number / divisor;
	    
//		return (int) (number / Math.pow(10, (int) Math.log10(number)));
	}
	
	private static int getLastDigit(int number)
	{
		return number % 10;
	}
}
