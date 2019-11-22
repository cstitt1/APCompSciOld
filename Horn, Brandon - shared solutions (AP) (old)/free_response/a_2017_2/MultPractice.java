package a_2017_2;

public class MultPractice implements StudyPractice
{
    private final int first;
    private int second;
    
    public MultPractice(int f, int s)
    {
        first = f;
        second = s;
    }
    
    public String getProblem()
    {
        return first + " TIMES " + second;
    }

    public void nextProblem()
    {
        second++;
    }
}