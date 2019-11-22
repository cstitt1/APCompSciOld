package p10_6;

public abstract class Worker
{
    private String name;
    private double rate;
    
    public Worker(String n, double r)
    {
        name = n;
        rate = r;
    }
    
    public String name()
    {
        return name;
    }
    
    public double rate()
    {
        return rate;
    }
    
    abstract double computePay(int hours);
}