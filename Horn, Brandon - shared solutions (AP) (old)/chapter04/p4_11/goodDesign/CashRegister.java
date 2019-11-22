package p4_11.goodDesign;

/**
 * A cash register totals up sales and computes change due.
 */
public class CashRegister
{
	public static final int DOLLAR_VALUE = 100;
	public static final int QUARTER_VALUE = 25;
	public static final int DIME_VALUE = 10;
	public static final int NICKEL_VALUE = 5;
	public static final int PENNY_VALUE = 1;

	private int purchaseCents;
	private int paymentCents;

	/**
	 * Constructs a cash register with no money in it.
	 */
	public CashRegister()
	{
		purchaseCents = 0;
		paymentCents = 0;
	}

	/**
	 * Records the purchase price of an item.
	 * 
	 * @param dollars
	 *            the dollar value of the purchase
	 * @param cents
	 *            the cent value of the purchase
	 */
	public void recordPurchase(int dollars, int cents)
	{
		purchaseCents += dollars * DOLLAR_VALUE + cents;
	}

	/**
	 * Enters the payment received from the customer.
	 * 
	 * @param dollars
	 *            the number of dollars in the payment
	 * @param quarters
	 *            the number of quarters in the payment
	 * @param dimes
	 *            the number of dimes in the payment
	 * @param nickels
	 *            the number of nickels in the payment
	 * @param pennies
	 *            the number of pennies in the payment
	 */
	public void enterPayment(int dollars, int quarters, int dimes, int nickels, int pennies)
	{
		paymentCents = dollars * DOLLAR_VALUE + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
	}

	/**
	 * Computes the amount of change due. Resets the register for the next purchase.
	 * 
	 * @return the amount of change due
	 */
	public Change giveChange()
	{
		Change c = new Change(giveCoins(DOLLAR_VALUE), giveCoins(QUARTER_VALUE), giveCoins(DIME_VALUE), giveCoins(NICKEL_VALUE), giveCoins(PENNY_VALUE));
		purchaseCents = 0;
		paymentCents = 0;
		return c;
	}

	/**
	 * Computes the number of units of the specified value due as change and deducts it from the
	 * amount of change due.
	 * 
	 * @param unitValue
	 *            the value of 1 unit in cents
	 * @return the number of units due as change
	 */
	private int giveCoins(int unitValue)
	{
		int coinsDue = (paymentCents - purchaseCents) / unitValue;
		paymentCents -= coinsDue * unitValue;
		return coinsDue;
	}
}