package a_2017_1;

import java.util.ArrayList;

import junit.framework.TestCase;

public class DigitsTest extends TestCase
{
    public void testConstructorAgainstExample1()
    {
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(1);
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(0);
        expectedResult.add(4);
        
        Digits d1 = new Digits(15704);
        assertTrue(d1.digitList.equals(expectedResult));
    }
    
    public void testConstructorAgainstExample2()
    {
        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(0);
        
        Digits d1 = new Digits(0);
        assertTrue(d1.digitList.equals(expectedResult));
    }
}