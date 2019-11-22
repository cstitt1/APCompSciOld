package p4_11.withRoundingErrorCorrected;

public class CashRegisterTester
{
	public static void main(String[] args)
	{
		CashRegister reg = new CashRegister();
		reg.recordPurchase(1,99);
		reg.recordPurchase(2,49);
		reg.recordPurchase(0,99); // total should be 5.47
		reg.enterPayment(20, 0, 0, 0, 0); // paid $20
		
		System.out.print("Change: ");
		System.out.print(reg.giveDollars() + " dollars, ");
		System.out.print(reg.giveQuarters() + " quarters, ");
		System.out.print(reg.giveDimes() + " dimes, ");
		System.out.print(reg.giveNickels() + " nickels, ");
		System.out.println(reg.givePennies() + " pennies");
		
		// owed 14.53 in change
		// output should be:
		// Change: 14 dollars, 2 quarters, 0 dimes, 0 nickels, 3 pennies
	}

}
