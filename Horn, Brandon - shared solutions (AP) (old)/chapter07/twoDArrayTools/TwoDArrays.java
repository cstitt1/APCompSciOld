package twoDArrayTools;

import java.util.Arrays;

public class TwoDArrays
{
    public static String toString(int[][] a)
    {
        String output = "";
        for(int[] row : a)
            output += Arrays.toString(row) + "\n";
        return output;
    }
}
