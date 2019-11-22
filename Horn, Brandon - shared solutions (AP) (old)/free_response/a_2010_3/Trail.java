package a_2010_3;

public class Trail
{
	private int[] markers;

	public boolean isLevelTrailSegment(int start, int end)
	{
		int min = markers[start];
		int max = markers[start];
		
		for(int i = start + 1; i <= end; i++)
		{
			if(min > markers[i])
				min = markers[i];
			
			if(max < markers[i])
				max = markers[i];
		}
		
		return (max - min) <= 10;
	}
	
	// Alternative solution (compares differences; uses early return):
	
	public boolean isLevelTrailSegment_Alternate(int start, int end)
	{
		for(int i = start; i < end; i++)
			for(int j = start + 1; j <= end; j++)
				if(Math.abs(markers[i] - markers[j]) > 10)
					return false;
		
		return true;
	}
	
	public boolean isDifficult()
	{
		int numChanges = 0;
		
		for(int i = 1; i < markers.length; i++)
			if(Math.abs(markers[i - 1] - markers[i]) >= 30)
				numChanges++;
		
		return numChanges >= 3;
	}
}
