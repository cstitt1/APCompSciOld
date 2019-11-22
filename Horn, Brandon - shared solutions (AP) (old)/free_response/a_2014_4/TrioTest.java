package a_2014_4;

import junit.framework.TestCase;

public class TrioTest extends TestCase
{
    public void testGetName()
    {
        Sandwich sw = new Sandwich("Cheeseburger", 2.75);
        Salad sal = new Salad("Spinich Salad", 1.25);
        Drink dr = new Drink("Orange Soda", 1.25);
        
        Trio t = new Trio(sw, sal, dr);
        
        String expectedResult = "Cheeseburger/Spinich Salad/Orange Soda Trio";
        String actualResult = t.getName();
        
        assertTrue(expectedResult.equals(actualResult));
    }
    
    public void testGetPriceAgainstExample1()
    {
        Sandwich sw = new Sandwich("Cheeseburger", 2.75);
        Salad sal = new Salad("Spinich Salad", 1.25);
        Drink dr = new Drink("Orange Soda", 1.25);
        
        Trio t = new Trio(sw, sal, dr);
        
        double expectedResult = 4.00;
        double actualResult = t.getPrice();
        
        assertTrue(Math.abs(actualResult - expectedResult) <= 0.001);
    }
    
    public void testGetPriceAgainstExample2()
    {
        Sandwich sw = new Sandwich("Club Sandwich", 2.75);
        Salad sal = new Salad("Coleslaw", 1.25);
        Drink dr = new Drink("Cappuccino", 3.50);
        
        Trio t = new Trio(sw, sal, dr);
        
        double expectedResult = 6.25;
        double actualResult = t.getPrice();
        
        assertTrue(Math.abs(actualResult - expectedResult) <= 0.001);
    }

    public void testGetPriceWithEqualLowests()
    {
        Sandwich sw = new Sandwich("Sandwich", 1.00);
        Salad sal = new Salad("Salad", 2.00);
        Drink dr = new Drink("Drink", 1.00);
        
        Trio t = new Trio(sw, sal, dr);
        
        double expectedResult = 3.00;
        double actualResult = t.getPrice();
        
        assertTrue(Math.abs(actualResult - expectedResult) <= 0.001);
        
        
        sw = new Sandwich("Sandwich", 1.00);
        sal = new Salad("Salad", 1.00);
        dr = new Drink("Drink", 2.00);
        
        t = new Trio(sw, sal, dr);
        
        expectedResult = 3.00;
        actualResult = t.getPrice();
        
        assertTrue(Math.abs(actualResult - expectedResult) <= 0.001);
    }
}