package r4_8;

public class R4_8
{

    public static void main(String[] args)
    {
        double x = 5.8;
//        double x = 5.4;
//        double x = 5.5;
        
//        double x = -5.8;
//        double x = -5.4;
//        double x = -5.5;
        
        int n = (int) (x + 0.5);
        System.out.println("(int) (" + x + " + 0.5): " + n);
        
        n = (int) Math.round(x);
        System.out.println("(int) Math.round(" + x + "): " + n);
    }

}
