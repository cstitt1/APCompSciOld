package p5_13;

import java.util.Scanner;

public class PaycheckCalculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Employee name: ");
		String name = scan.next();
		System.out.print("Hourly wage: $");
		double hourlyRate = scan.nextDouble();
		
		scan.close();
		
		Paycheck pc = new Paycheck(name, hourlyRate);
		
		System.out.print("Hours worked: ");
		double pay = pc.computeWeeklyPay(scan.nextDouble());
		
		System.out.println("Pay: $" + pay);
	}
}
