package p9_3_with_callback;

import shared.Measurer;

public class StringLengthMeasurer implements Measurer<String>
{
   public double measure(String aString)
   {
	   return aString.length();
   }
}