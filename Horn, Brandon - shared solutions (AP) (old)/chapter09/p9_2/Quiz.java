package p9_2;

import shared.Measurable;

public class Quiz implements Measurable
{
    private double score;
    
    public Quiz(double score)
    {
        this.score = score;
    }
    
    public double getScore()
    {
        return score;
    }
    
    public String getLetterGrade()
    {
        if(score >= 95)
            return "A+";
        else if(score >= 90)
            return "A";
        else if(score >= 85)
            return "B+";
        else if(score >= 80)
            return "B";
        else if(score >= 75)
            return "C+";
        else if(score >= 70)
            return "C";
        else if(score >= 65)
            return "D";
        else
            return "F";
    }
    
    public double getMeasure()
    {
        return score;
    }
}
