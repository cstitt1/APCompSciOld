package p5_2.withExceptions;

import java.util.Scanner;

public class CardRunner
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the card notation:");
		Card c = new Card(scan.next());
		System.out.println(c.getDescription());
	}
}
