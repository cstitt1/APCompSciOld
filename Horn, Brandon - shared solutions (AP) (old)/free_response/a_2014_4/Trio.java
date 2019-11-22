package a_2014_4;

public class Trio implements MenuItem
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    
    public Trio(Sandwich sand, Salad sal, Drink dr)
    {
        sandwich = sand;
        salad = sal;
        drink = dr;
    }

    public String getName()
    {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    public double getPrice()
    {
        MenuItem cheapest = sandwich;
        
        if(salad.getPrice() < cheapest.getPrice())
            cheapest = salad;
        
        if(drink.getPrice() < cheapest.getPrice())
            cheapest = drink;
        
        return sandwich.getPrice() + salad.getPrice() + drink.getPrice() - cheapest.getPrice();
    }
}
