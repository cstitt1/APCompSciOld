package p9_3;

import shared.DataSet_9_1;
import shared.Measurable;

public class PersonTest
{
	public static void main(String[] args)
	{
		Person legolas = new Person("Legolas", 182);
		Person gimli = new Person("Gimli", 91);
		Person frodo = new Person("Frodo", 121);
		
		DataSet_9_1 ds = new DataSet_9_1();
		
		ds.add(legolas);
		ds.add(gimli);
		ds.add(frodo);
		
		System.out.println("Average height: " + ds.getAverage());
		Measurable biggest = ds.getMaximum();
		System.out.println(biggest.getMeasure());
		Person tallest = (Person) biggest;
		System.out.println(tallest.name() + " is tallest");
	}
}
