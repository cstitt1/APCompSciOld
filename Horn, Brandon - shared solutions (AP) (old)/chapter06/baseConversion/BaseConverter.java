package baseConversion;

public class BaseConverter
{
    static char digitToChar(int digit) // package access for testing
    {
        if(digit <= 9)
            return ("" + digit).charAt(0); // TODO: figure out a better way of doing this
        
        return (char) ('A' + (digit - 10));
    }
    
    public static String convertFromBase10(int num, int targetBase)
    {
        String numInTargetBase = "";
        
        int numRemaining = num;
        
        while(numRemaining > 0)
        {
            int digit = (numRemaining % targetBase);
            numInTargetBase = digitToChar(digit) + numInTargetBase;
            numRemaining /= targetBase;
        }
        
        return numInTargetBase;
    }

    static int charToValue(char digit) // package access for testing
    {
        if(digit >= '0' && digit <= '9')
            return (int) digit - '0';
        else
            return (int) (digit - 'A') + 10;
    }
    
    public static int convertToBase10(String num, int originalBase)
    {
        int inBase10 = 0;
        
        for(int i = 0; i < num.length(); i++)
        {
            int power = num.length() - i - 1; // this is a very common technique to get "the other end"
            int digit = charToValue(num.charAt(i));
            inBase10 += Math.pow(originalBase, power) * digit;
        }
        
        return inBase10;
    }

    public static String convert(String num, int originalBase, int targetBase)
    {
        int inBase10 = convertToBase10(num, originalBase);
        return convertFromBase10(inBase10, targetBase);
    }
}
