package p3_5;

public class CarRunner
{
	public static void main(String[] args)
	{
		Car myCar = new Car(10); // construct a car that gets 10 mpg
		myCar.addGas(25); // start with 25 gallons
		myCar.drive(30); // drive 30 miles, or 3 gallons
		System.out.println(myCar.checkFuel()); // should have 22 gallons left
		
		Car yourCar = new Car(20);
		yourCar.addGas(25);
		yourCar.drive(30); // uses 1.5 gallons
		System.out.println(yourCar.checkFuel());
		
		System.out.println(myCar.checkFuel());
	}

}
