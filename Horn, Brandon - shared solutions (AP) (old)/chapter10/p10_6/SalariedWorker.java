package p10_6;

public class SalariedWorker extends Worker
{
    public SalariedWorker(String n, double r)
    {
        super(n, r);
    }
    
    public double computePay(int hours)
    {
        return rate() * 40;
    }
}