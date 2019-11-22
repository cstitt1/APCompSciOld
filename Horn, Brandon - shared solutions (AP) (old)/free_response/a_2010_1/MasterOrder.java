package a_2010_1;

import java.util.*;

public class MasterOrder
{
	private List<CookieOrder> orders;
	
	public MasterOrder()
	{
		orders = new ArrayList<CookieOrder>();
	}
	
	public void addOrder(CookieOrder theOrder)
	{
		orders.add(theOrder);
	}
	
	public int getTotalBoxes()
	{
		int sum = 0;
		
		for(CookieOrder order : orders)
			sum += order.getNumBoxes();
		
		return sum;
	}
	
	public int removeVariety(String cookieVar)
	{
		int numBoxesRemoved = 0;
		
		for(int i = orders.size() - 1; i >= 0; i--)
			if(cookieVar.equals(orders.get(i).getVariety()))
				numBoxesRemoved += orders.remove(i).getNumBoxes();
		
		return numBoxesRemoved;
	}
}
