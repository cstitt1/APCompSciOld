package a_2015_3;

import java.util.ArrayList;
import java.util.List;

public class SparseArray
{
	int numRows;
	int numCols;
	
	List<SparseArrayEntry> entries;
	
	public SparseArray()
	{
		entries = new ArrayList<SparseArrayEntry>();
	}
	
	public int getNumRows()
	{
		return numRows;
	}
	
	public int getNumCols()
	{
		return numCols;
	}
	
	public void addValue(int row, int col, int value)
	{
		entries.add(new SparseArrayEntry(row, col, value));
	}
	
	public int getValueAt(int row, int col)
	{
	  for(SparseArrayEntry entry : entries)
	    if(entry.getRow() == row && entry.getCol() == col)
	      return entry.getValue();

	  return 0;
	}
	
	public void removeColumn(int col)
	{
	  for(int i = entries.size() - 1; i >= 0; i--)
	  {
	    SparseArrayEntry entry = entries.get(i);
	    
	    if(entry.getCol() == col)
	      entries.remove(i);
	    else if(entry.getCol() > col)
	      entries.set(i, new SparseArrayEntry(
	          entry.getRow(), entry.getCol() - 1, entry.getValue()));
	  }
	  
	  numCols--;
	}
}
