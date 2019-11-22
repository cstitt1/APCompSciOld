package a_2012_4;

public class Grayimage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public int countWhitePixels()
    {
        int whitePixels = 0;

        for (int row = 0; row < pixelValues.length; row++)
            for (int col = 0; col < pixelValues[row].length; col++)
                if (pixelValues[row][col] == WHITE)
                    whitePixels++;

        return whitePixels;
    }

    public void processImage()
    {
        for (int row = 0; row < pixelValues.length - 2; row++)
        {
            for (int col = 0; col < pixelValues[row].length - 2; col++)
            {
                pixelValues[row][col] -= pixelValues[row + 2][col + 2];
                if (pixelValues[row][col] < BLACK)
                    pixelValues[row][col] = BLACK;
            }
        }
    }
}