package p5_11;

import java.util.Scanner;

public class ToolRunner
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double d1, d2;
		
		System.out.println("Enter two floating-point numbers:");
		d1 = scan.nextDouble();
		d2 = scan.nextDouble();
		
		scan.close();
		
		if(FloatingPointTools.sameWhenRounded(d1, d2))
			System.out.println("They are the same when rounded to two decimal places.");
		else
			System.out.println("They are different when rounded to two decimal places.");
		
		if(FloatingPointTools.differByLess(d1, d2))
			System.out.println("They differ by less than 0.01.");
		else
			System.out.println("They differ by at least 0.01.");
	}
}
