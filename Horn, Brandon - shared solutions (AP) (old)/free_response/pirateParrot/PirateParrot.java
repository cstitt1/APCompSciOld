package pirateParrot;

public class PirateParrot extends Parrot
{
    /** The total number of years the pirate parrot has stolen */
    private int yearsStolen = 0;

    public PirateParrot(String name)
    {
        super(name);
        train("Polly want a cracker");
    }

    public int getAge()
    {
        return super.getAge() + yearsStolen;
    }

    public void stealSoul(int soulAge)
    {
        yearsStolen += soulAge;
    }
}
