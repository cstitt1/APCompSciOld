package a_2017_4;

public class Successors
{
    public static Position findPosition(int num, int[][] intArr)
    {
        for(int r = 0; r < intArr.length; r++)
            for(int c = 0; c < intArr[0].length; c++)
                if(intArr[r][c] == num)
                    return new Position(r, c);
        
        return null;
    }
    
    public static Position[][] getSuccessorArray(int[][] intArr)
    {
        Position[][] successors = new Position[intArr.length][intArr[0].length];
        
        for(int r = 0; r < successors.length; r++)
            for(int c = 0; c < successors[0].length; c++)
                successors[r][c] = findPosition(intArr[r][c] + 1, intArr);
        
        return successors;
    }
}
