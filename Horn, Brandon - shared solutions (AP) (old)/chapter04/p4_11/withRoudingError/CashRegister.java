package p4_11.withRoudingError;

/**
 * A cash register totals up sales and computes change due.
 */
public class CashRegister
{
	public static final double QUARTER_VALUE = 0.25;
	public static final double DIME_VALUE = 0.1;
	public static final double NICKEL_VALUE = 0.05;
	public static final double PENNY_VALUE = 0.01;

	private double purchase;
	private double payment;

	/**
	 * Constructs a cash register with no money in it.
	 */
	public CashRegister()
	{
		purchase = 0;
		payment = 0;
	}

	/**
	 * Records the purchase price of an item.
	 * 
	 * @param amount
	 *            the price of the purchased item
	 */
	public void recordPurchase(double amount)
	{
		purchase = purchase + amount;
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
		payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
	}

	/**
	 * Computes the number of whole dollars due as change and deducts it from the amount of change
	 * due.
	 * 
	 * @return the number of whole dollars due as change
	 */
	public int giveDollars()
	{
		int dollarsDue = (int) (payment - purchase);
		payment -= dollarsDue;
		return dollarsDue;
	}

	/**
	 * Computes the number of quarters due as change and deducts it from the amount of change due.
	 * 
	 * @return the number of quarters due as change
	 */
	public int giveQuarters()
	{
		return giveCoins(QUARTER_VALUE);
	}

	/**
	 * Computes the number of dimes due as change and deducts it from the amount of change due.
	 * 
	 * @return the number of dimes due as change
	 */
	public int giveDimes()
	{
		return giveCoins(DIME_VALUE);
	}

	/**
	 * Computes the number of nickels due as change and deducts it from the amount of change due.
	 * 
	 * @return the number of nickels due as change
	 */
	public int giveNickels()
	{
		return giveCoins(NICKEL_VALUE);
	}

	/**
	 * Computes the number of pennies due as change and deducts it from the amount of change due.
	 * Resets the register for the next purchase.
	 * 
	 * @return the number of pennies due as change
	 */
	public int givePennies()
	{
		int penniesDue = giveCoins(PENNY_VALUE);
		purchase = 0;
		payment = 0;
		return penniesDue;
	}

	/**
	 * Computes the number of coins of the specified value due as change and deducts it from the
	 * amount of change due.
	 * 
	 * @param coinValue
	 *            the value of 1 coin
	 * @return the number of coins due as change
	 */
	private int giveCoins(double coinValue)
	{
		int coinsDue = ((int) ((payment - purchase) * 100)) / ((int) (coinValue * 100));
		payment -= coinsDue * coinValue;
		return coinsDue;
	}
}