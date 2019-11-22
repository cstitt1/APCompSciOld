package a_2017_4;

public class Position
{
    public final int row, col;
    
    public Position(int r, int c)
    {
        row = r;
        col = c;
    }
    
    public boolean equals(Object other)
    {
        Position otherPos = (Position) other;
        
        return row == otherPos.row && col == otherPos.col;
    }
}
