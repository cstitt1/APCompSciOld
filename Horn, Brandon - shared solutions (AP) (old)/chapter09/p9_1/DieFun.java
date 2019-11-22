package p9_1;

import shared.DataSet_9_1;

public class DieFun
{
	public static void main(String[] arg)
	{
		DataSet_9_1 ds = new DataSet_9_1();
		
		for(int i = 1; i <= 100; i++)
		{
			Die d = new Die(6);
			d.cast();
			ds.add(d);
		}
		
		System.out.println("Average: " + ds.getAverage());
	}
}
