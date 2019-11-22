package p9_2;

import shared.DataSet_9_1;

public class QuizFun
{
    public static void main(String[] args)
    {
        DataSet_9_1 ds = new DataSet_9_1();
        
        ds.add(new Quiz(90));
        ds.add(new Quiz(75));
        ds.add(new Quiz(80));
        
        System.out.println("Average: " + ds.getAverage());
        
        Quiz best = (Quiz) ds.getMaximum();
        System.out.println("Best score: " + best.getScore());
        System.out.println("Best grade: " + best.getLetterGrade());
    }
}
