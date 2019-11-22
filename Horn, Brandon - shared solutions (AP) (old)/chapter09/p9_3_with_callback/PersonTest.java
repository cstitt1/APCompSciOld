package p9_3_with_callback;

import shared.DataSet_9_4;

public class PersonTest
{
	public static void main(String[] args)
	{
		Person legolas = new Person("Legolas", 182);
		Person gimley = new Person("Gimley", 91);
		Person frodo = new Person("Frodo", 121);
		
		DataSet_9_4<Person> ds = new DataSet_9_4<Person>(new PersonHeightMeasurer());
		
		ds.add(legolas);
		ds.add(gimley);
		ds.add(frodo);
		
		System.out.println("Average height: " + ds.getAverage());
		Person tallest = ds.getMaximum(); // look, no cast
		System.out.println(tallest.name() + " is tallest");
	}
}
