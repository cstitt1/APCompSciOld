package a_2017_2;

import junit.framework.TestCase;

public class MultPracticeTest extends TestCase
{
    public void testAgainstExample1()
    {
        StudyPractice p1 = new MultPractice(7, 3);
        assertTrue(p1.getProblem().equals("7 TIMES 3"));
        
        p1.nextProblem();
        assertTrue(p1.getProblem().equals("7 TIMES 4"));
        
        p1.nextProblem();
        assertTrue(p1.getProblem().equals("7 TIMES 5"));
        
        p1.nextProblem();
        assertTrue(p1.getProblem().equals("7 TIMES 6"));
    }

    public void testAgainstExample2()
    {
        StudyPractice p2 = new MultPractice(4, 12);
        p2.nextProblem();
        assertTrue(p2.getProblem().equals("4 TIMES 13"));
        assertTrue(p2.getProblem().equals("4 TIMES 13"));
        
        p2.nextProblem();
        p2.nextProblem();
        assertTrue(p2.getProblem().equals("4 TIMES 15"));
        
        p2.nextProblem();
        assertTrue(p2.getProblem().equals("4 TIMES 16"));
    }
}