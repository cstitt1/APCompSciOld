package shared;

public class DataSetTester
{
	public static void main(String[] args)
	{
		Measurable esha = new Student("esha", 3.6);
		//Measurable nikhil = new Student("nikhil", 2.0);
		Measurable babe = new Pig();
		
		DataSet_9_1 ds = new DataSet_9_1();
		ds.add(babe);
		ds.add(esha);
		
		//Student theBest = (Student) ds.getMaximum();
		//System.out.println(theBest.getName());
		
		Measurable theBest = ds.getMaximum();
		System.out.println(theBest.getMeasure());
		
	}
}
