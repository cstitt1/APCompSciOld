package p9_3_with_callback;

import shared.Measurer;

public class PirateStringMeasurer implements Measurer<String>
{

    @Override
    /**
     * @return the number of lowercase "p"'s in <code>theString</code>
     */
    public double measure(String theString)
    {
        int count = 0;
        for(int i = 0; i < theString.length(); i++)
            if(theString.charAt(i) == 'p')
                count++;
        return count;
    }
    
}
