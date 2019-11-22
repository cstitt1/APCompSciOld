package p7_13;

import twoDArrayTools.TwoDArrays;

public class MagicSquare
{
    private int[][] square;
    
    public MagicSquare(int n)
    {
        if(n < 1 || n % 2 == 0)
            throw new IllegalArgumentException("n must be positive and even.");
        
        square = new int[n][n];
        
        int row = n - 1;
        int col = n / 2;
        
        for(int k = 1; k <= n * n; k++)
        {
            square[row][col] = k;
            
            if(row == n - 1 && col == n - 1)  // in lower right corner
            {
                row--; // move straight up
            }
            else
            {
                int origRow = row;
                int origCol = col;
                
                // try to move right and down, wrap around borders if necessary
                row++;
                col++;
                
                if(row == n)
                    row = 0;
                
                if(col == n)
                    col = 0;
                
                if(square[row][col] != 0) // square[row][col] has already been filled
                {
                    // move straight up from original position
                    row = origRow - 1;
                    col = origCol;
                }
            }
        }
    }
    
    public int[][] square()
    {
        return square.clone();
    }
    
    public String toString()
    {
        return TwoDArrays.toString(square);
    }
}
