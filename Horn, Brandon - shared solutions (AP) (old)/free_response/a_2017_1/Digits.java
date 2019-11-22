package a_2017_1;

import java.util.ArrayList;

public class Digits
{
    ArrayList<Integer> digitList;
    
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        digitList.add(0, new Integer(num % 10));
        
        int numRemaining = num / 10;
        while(numRemaining > 0)
        {
            digitList.add(0, new Integer(numRemaining % 10));
            numRemaining /= 10;
        }
    }
    
    public boolean isStrictlyIncreasing()
    {
        for(int i = 1; i < digitList.size(); i++)
            if(digitList.get(i - 1) >= (digitList.get(i)))
                return false;
        
        return true;
    }
}
