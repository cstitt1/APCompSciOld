package a_2014_4;

// this class is used to simplify testing
// it is not part of the original problem
public class Item implements MenuItem
{
    private String name;
    private double price;
    
    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
}
