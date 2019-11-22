package p7_12_2D_array;

import twoDArrayPractice.TwoDArrayPractice;

public class MagicSquare
{
    private int[][] numbers;
    private int count;
    
    public MagicSquare()
    {
        numbers = new int[1][1];
        count = 0;
    }
    
    // note: all private methods are package access for testing
    
    int n()
    {
        return numbers.length;
    }
    
    void grow()
    {
        numbers = TwoDArrayPractice.grow(numbers, n() + 1, n() + 1);
    }
    
    public void add(int num)
    {
        if(count == n() * n())
            grow();
        
        numbers[count / n()][count % n()] = num;
        count++;
    }
    
    // Any 0's in numbers will cause this to return false, so there is no need to check
    // that sufficient numbers were added.
    boolean oneThroughNSquared()
    {
        int n = n();
        
        boolean[] found = new boolean[n * n]; // [x - 1] stores whether x was found in numbers
        
        for(int r = 0; r < n; r++)
        {
            for(int c = 0; c < n; c++)
            {
                int num = numbers[r][c];
                
                if(num < 1 || num > n * n)
                    return false;
                
                if(found[num - 1])
                    return false;
                
                found[num - 1] = true;
            }
        }
        
        return true;
    }
    
    int rowSum(int row)
    {
        int n = n();
        int sum = 0;
        
        for(int col = 0; col < n; col++)
            sum += numbers[row][col];
        
        return sum;
    }

    int colSum(int col)
    {
        int n = n();
        int sum = 0;
        
        for(int row = 0; row < n; row++)
            sum += numbers[row][col];
        
        return sum;
    }
    
    // precondition: nSquareNums()
    int topLeftDiagSum()
    {
        int n = n();
        int sum = 0;
        
        for(int rc = 0; rc < n; rc++)
            sum += numbers[rc][rc];
        
        return sum;
    }
    
    // precondition: nSquareNums()
    int topRightDiagSum()
    {
        int n = n();
        int sum = 0;
        
        for(int row = 0; row < n; row++)
            sum += numbers[row][n - row - 1];
        
        return sum;
    }
    
    public boolean isMagic()
    {
        if( ! oneThroughNSquared() )
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