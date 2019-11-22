package p4_18;

import java.util.Scanner;


public class RunThis
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = input.nextInt();

		Easter e = new Easter(year);

		System.out.println("\n" + e.getEasterSundayMonth() + "/"
				+ e.getEasterSundayDay() + "/" + year);

	}
}
