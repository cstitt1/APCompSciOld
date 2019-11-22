package project3_1;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{
    public static final int FREE_TRANSACTIONS = 5;
    
    private double fee = 5;
    private double balance;
    private int transactions;

    /**
       Constructs a bank account with a zero balance.
    */
    public BankAccount()
    {
        balance = 0;
        transactions = 0;
    }

    /**
     * Sets the fee for each transaction in excess of FREE_TRANSACTIONS
     * @param newFee the fee for each transaction
     */
    public void setFee(double newFee)
    {
        fee = newFee;
    }
    
    /**
       Constructs a bank account with a given balance.
       @param initialBalance the initial balance
    */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
        transactions = 0;
    }

    /**
       Deposits money into the bank account.
       @param amount the amount to deposit
    */
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
        transactions++;
    }

    /**
       Withdraws money from the bank account.
       @param amount the amount to withdraw
    */
    public void withdraw(double amount)
    {
        double newBalance = balance - amount;
        balance = newBalance;
        transactions++;
    }

    /**
       Gets the current balance of the bank account.
       @return the current balance
    */
    public double getBalance()
    {
        return balance;
    }

    public void deductMonthlyCharge()
    {
        if(transactions > FREE_TRANSACTIONS)
            balance -= (transactions - FREE_TRANSACTIONS) * fee;
        
        transactions = 0;
    }
}