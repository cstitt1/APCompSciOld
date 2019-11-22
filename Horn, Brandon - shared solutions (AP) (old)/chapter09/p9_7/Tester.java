package p9_7;

import p9_1.Die;
import shared.Measurable;

public class Tester
{
    public static void main(String[] args)
    {
        DataSet<Measurable> ds = new DataSet<Measurable>();
        
        for(int n = 1; n <= 10; n++)
        {
            Die d = new Die(6);
            d.cast();
            ds.add(d);
        }
        
        System.out.println(ds.getAverage());
    }
}
