package p7_13;

import junit.framework.TestCase;

public class MagicSquareTester extends TestCase
{
    public void testMagicSquareWithBookCase()
    {
        MagicSquare ms = new MagicSquare(5);
        assertTrue(ms.toString().equals("[11, 18, 25, 2, 9]\n[10, 12, 19, 21, 3]\n[4, 6, 13, 20, 22]\n" +
        		"[23, 5, 7, 14, 16]\n[17, 24, 1, 8, 15]\n"));
    }
}
