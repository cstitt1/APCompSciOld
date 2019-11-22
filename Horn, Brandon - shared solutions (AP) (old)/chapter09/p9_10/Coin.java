package p9_10;

/**
   A coin with a monetary value.
*/
public class Coin implements Comparable<Coin>
{
    private double value;
    private String name;

    /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
    */
    public Coin(double aValue, String aName)
    {
        value = aValue;
        name = aName;
    }

    /**
      Gets the coin value.
      @return the value
    */
    public double getValue()
    {
        return value;
    }

    /**
      Gets the coin name.
      @return the name
    */
    public String getName()
    {
        return name;
    }
    
    public int compareTo(Coin otherCoin)
    {
        // note: the problem did not specify what coins
        // were supposed to be compared based on, so that's
        // up to you
        
        return name.compareTo(otherCoin.getName());
        
        // alternative with comparison based on values instead
//        Double thisValue = new Double(value);
//        Double otherValue = new Double(otherCoin.value);
//        
//        return thisValue.compareTo(otherValue);
    }
}