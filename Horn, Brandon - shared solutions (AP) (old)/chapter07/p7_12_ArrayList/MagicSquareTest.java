package p7_12_ArrayList;

import junit.framework.TestCase;

public class MagicSquareTest extends TestCase
{
    public void testNSquaredNums()
    {
        MagicSquare ms = new MagicSquare();
        
        assertTrue( ! ms.nSquaredNums() );
        
        ms.add(1);
        assertTrue(ms.nSquaredNums());
        
        ms.add(2);
        assertTrue( ! ms.nSquaredNums() );
        
        ms.add(3);
        assertTrue( ! ms.nSquaredNums() );
        
        ms.add(1);
        assertTrue(ms.nSquaredNums());
    }
    
    public void testOneThroughNSquared()
    {
        MagicSquare ms = new MagicSquare();
        
        ms.add(2);
        assertTrue( ! ms.oneThroughNSquared() );
        
        ms.add(1);
        ms.add(3);
        ms.add(4);
        assertTrue(ms.oneThroughNSquared());
        
        ms.add(0);
        ms.add(6);
        ms.add(7);
        ms.add(8);
        ms.add(9);
        assertTrue( ! ms.oneThroughNSquared() );
        
        // TODO: test too big, test repeated number
    }

    public void testSums()
    {
        MagicSquare ms = new MagicSquare();
        
        ms.add(6);
        ms.add(1);
        ms.add(2);
        ms.add(8);
        ms.add(3);
        ms.add(4);
        ms.add(5);
        ms.add(7);
        ms.add(9);
        
        int actualValue = ms.rowSum(0);
        assertTrue(actualValue == 9);
        
        actualValue = ms.rowSum(2);
        assertTrue(actualValue == 21);
        
        actualValue = ms.colSum(0);
        assertTrue(actualValue == 19);
        
        actualValue = ms.colSum(2);
        assertTrue(actualValue == 15);
        
        actualValue = ms.topLeftDiagSum();
        assertTrue(actualValue == 18);
        
        actualValue = ms.topRightDiagSum();
        assertTrue(actualValue == 10);
    }

    public void testIsMagicTrue()
    {
        MagicSquare ms = new MagicSquare();
        
        ms.add(16);
        ms.add(3);
        ms.add(2);
        ms.add(13);
        
        ms.add(5);
        ms.add(10);
        ms.add(11);
        ms.add(8);
        
        ms.add(9);
        ms.add(6);
        ms.add(7);
        ms.add(12);
        
        ms.add(4);
        ms.add(15);
        ms.add(14);
        ms.add(1);
        
        assertTrue(ms.isMagic());
    }

    public void testIsMagicNotNSquaredNums()
    {
        MagicSquare ms = new MagicSquare();
        
        ms.add(16);
        ms.add(3);
        ms.add(2);
        
        assertTrue( ! ms.isMagic() );
        
        ms.add(13);
        ms.add(5);
        
        assertTrue( ! ms.isMagic() );
    }
    
    public void testIsMagicNotOneThroughN()
    {
        MagicSquare ms = new MagicSquare();
        
        ms.add(16);
        ms.add(3);
        ms.add(2);
        ms.add(13);
        
        assertTrue( ! ms.isMagic() );
    }
    
    // TODO: test bad row sum, bad col sum, bad diag sum
}