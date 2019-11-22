package p10_6;

import java.util.ArrayList;
import java.util.List;

public class Workplace
{
	public static void main(String[] args)
	{
		List<Worker> workers = new ArrayList<Worker>();
		workers.add(new HourlyWorker("Jack", 15));
		workers.add(new HourlyWorker("Jill", 20));
		workers.add(new SalariedWorker("Giant", 20));
		
		int hours = 45;
		
		for(Worker w : workers)
			System.out.println(w.name() + ": " + w.computePay(hours));
	}
}
