package p10_6;

public class HourlyWorker extends Worker
{
    public HourlyWorker(String n, double r)
    {
        super(n, r);
    }
    
    public double computePay(int hours)
    {
        double pay = rate() * hours;
        if(hours > 40)
            pay += (hours - 40) * (rate() / 2); // only the hours over 40 are paid at the overtime rate
        return pay;
        
        // alternate solution
//      return rate() * (hours + (hours > 40 ? (hours - 40) / 2.0 : 0));
    }
}

