package p7_12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MagicSquare
{
    private List<Integer> numbers;
    
    public MagicSquare()
    {
        numbers = new ArrayList<Integer>();
    }
    
    // note: all private methods are package access for testing
    
    public void add(int num)
    {
        numbers.add(num);
    }
    
    boolean nSquaredNums()
    {
        if(numbers.size() == 0)
            return false;
        
        // TODO: does this work in ALL cases?
        int sqrt = (int) Math.sqrt(numbers.size());
        return sqrt * sqrt == numbers.size();
    }
    
    // precondition: nSquareNums()
    boolean oneThroughNSquared()
    {
        boolean[] found = new boolean[numbers.size()]; // [x - 1] stores whether x was found in numbers
        
        for(int num : numbers)
        {
            if(num < 1 || num > numbers.size())
                return false;
            
            if(found[num - 1])
                return false;
            
            found[num - 1] = true;
        }
        
        return true;
    }

    // precondition: nSquareNums()
    int n()
    {
        return (int) Math.sqrt(numbers.size());
    }
    
    // precondition: nSquareNums() 
    int getValue(int row, int col)
    {
        return numbers.get(row * n() + col);
    }
    
    // precondition: nSquareNums()
    int rowSum(int row)
    {
        int n = n();
        int sum = 0;
        
        for(int col = 0; col < n; col++)
            sum += getValue(row, col);
        
        return sum;
    }

    // precondition: nSquareNums()
    int colSum(int col)
    {
        int n = n();
        int sum = 0;
        
        for(int row = 0; row < n; row++)
            sum += getValue(row, col);
        
        return sum;
    }
    
    // precondition: nSquareNums()
    int topLeftDiagSum()
    {
        int n = n();
        int sum = 0;
        
        for(int rc = 0; rc < n; rc++)
            sum += getValue(rc, rc);
        
        return sum;
    }
    
    // precondition: nSquareNums()
    int topRightDiagSum()
    {
        int n = n();
        int sum = 0;
        
        for(int row = 0; row < n; row++)
            sum += getValue(row, n - row - 1);
        
        return sum;
    }
    
    public boolean isMagic()
    {
        if( ! nSquaredNums() || ! oneThroughNSquared() )
            return false;
        
        final int sum = topLeftDiagSum();
        
        if(sum != topRightDiagSum())
            return false;
        
        int n = n();
        for(int rc = 0; rc < n; rc++)
            if(rowSum(rc) != sum || colSum(rc) != sum)
                return false;
        
        return true;
    }
}