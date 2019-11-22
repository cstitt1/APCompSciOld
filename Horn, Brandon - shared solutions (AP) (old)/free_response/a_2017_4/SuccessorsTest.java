package a_2017_4;

import junit.framework.TestCase;

public class SuccessorsTest extends TestCase
{
    private int[][] arr;
    
    public void setUp()
    {
        arr = new int[][]{
                {15, 5, 9, 10},
                {12, 16, 11, 6},
                {14, 8, 13, 7}
        };
    }
    
    public void testFindPositionAgainstExamples()
    {
        Position pos = Successors.findPosition(8, arr);
        assertTrue(pos.row == 2 && pos.col == 1);
        
        pos = Successors.findPosition(17, arr);
        assertTrue(pos == null);
    }

    private static boolean areSame(Position[][] one, Position[][] two)
    {
        if(one.length != two.length || one[0].length != two[0].length)
            return false;
        
        for(int r = 0; r < one.length; r++)
        {
            for(int c = 0; c < one[0].length; c++)
            {
                Position p1 = one[r][c];
                Position p2 = two[r][c];
                
                if(p1 == null)
                {
                    if(p2 != null)
                        return false;
                }
                else
                {
                    if( ! p1.equals(p2) )
                        return false;
                }
            }
        }
        
        return true;
    }
    
    public void testGetSuccessorArrayAgainstExample()
    {
        Position[][] expectedResult = {
                {new Position(1, 1), new Position(1, 3), new Position(0, 3), new Position(1, 2)},
                {new Position(2, 2), null, new Position(1, 0), new Position(2, 3)},
                {new Position(0, 0), new Position(0, 2), new Position(2, 0), new Position(2, 1)}
        };
        
        Position[][] actualResult = Successors.getSuccessorArray(arr);
        
        assertTrue(areSame(expectedResult, actualResult));
    }
}