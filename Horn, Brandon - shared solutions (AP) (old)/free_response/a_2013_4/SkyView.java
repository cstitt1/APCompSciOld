package a_2013_4;

public class SkyView
{
    public double[][] view;
    
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        
        int scannedIndex = 0;
        
        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                if(row % 2 == 0)
                    view[row][col] = scanned[scannedIndex];
                else
                    view[row][numCols - col - 1] = scanned[scannedIndex];
                
                scannedIndex++;
            }
        }
    }
    
    // alternate approach
//    public SkyView(int numRows, int numCols, double[] scanned)
//    {
//        view = new double[numRows][numCols];
//        
//        int scannedIndex = 0;
//        
//        for(int row = 0; row < numRows; row++)
//        {
//            if( row % 2 == 0)
//            {
//                for(int col = 0; col < numCols; col++)
//                {
//                    view[row][col] = scanned[scannedIndex];
//                    scannedIndex++;
//                }
//            }
//            else
//            {
//                for(int col = numCols - 1; col >= 0; col--)
//                {
//                    view[row][col] = scanned[scannedIndex];
//                    scannedIndex++;
//                }
//            }
//        }
//    }
    
    public double getAverage(int startRow, int endRow,
            int startCol, int endCol)
    {
        double sum = 0;
        int count = 0;
        
        // value can be calculated instead of computed but this is harder and unnecessary
//        int count = (endRow - startRow + 1) * (endCol - startCol + 1);
        
        for(int row = startRow; row <= endRow; row++)
        {
            for(int col = startCol; col <= endCol; col++)
            {
                sum += view[row][col];
                count++;
            }
        }
        
        return sum / count;
    }
}
