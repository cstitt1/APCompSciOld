package p9_9;

public class Tester
{
	public static void main(String[] args)
	{
	    String b = "brian";
		String one = "the";
		String two = "annoying";
		String three = "student";
		
		DataSetParameterized<String> ds = new DataSetParameterized<String>();
//		DataSet ds = new DataSet();
		
		ds.add(b);
		ds.add(one);
		ds.add(two);
		ds.add(three);
		
//		ds.add(new Integer(5));
		
		System.out.println(ds.getMinimum().toUpperCase());
		
//		System.out.println("min: " + ds.getMinimum());
//		System.out.println("max: " + ds.getMaximum());
	}
}
