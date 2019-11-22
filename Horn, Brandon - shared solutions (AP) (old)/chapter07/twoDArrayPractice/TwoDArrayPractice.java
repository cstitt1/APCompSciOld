package twoDArrayPractice;

public class TwoDArrayPractice
{
    /**
     * Returns a larger array containing the same elements as the
     * mat. The elements from mat are read in row-major order and
     * appear in the new array in row-major order.
     * 
     * For example, if mat was:
     * { {10, 9, 8, 7},
     *   {6, 5, 4, 3},
     *   {2, 1, -1, 0} }
     * 
     * newRows was 4 and newCols was 5
     * the returned array would be:
     * { {10, 9, 8, 7, 6},
     *   {5, 4, 3, 2, 1},
     *   {-1, 0, 0, 0, 0},
     *   {0, 0, 0, 0, 0} }
     * 
     * Precondition: newRows > mat.length && newCols > mat[0].length
     * 
     * @param mat the 2D array containing the original elements
     * @param newRows the number of rows in the new array
     * @param newCols the number of columns in the new array
     * @return a larger array containing the elements from mat in row-major order
     */
    public static int[][] grow(int[][] mat, int newRows, int newCols)
    {
        int[][] newMat = new int[newRows][newCols];
        
        // since we're only visiting the elements in mat, use the loops to traverse mat
        int newMatRow = 0, newMatCol = 0;
        for(int matRow = 0; matRow < mat.length; matRow++)
        {
            for(int matCol = 0; matCol < mat[matRow].length; matCol++)
            {
                newMat[newMatRow][newMatCol] = mat[matRow][matCol];
                
                newMatCol++;
                if(newMatCol == newMat[newMatRow].length)
                {
                    newMatRow++;
                    newMatCol = 0;
                }
            }
        }
        
        return newMat;
        
        // traverse a 2D array with a while loop to print out in row major order
    }
    
    /**
     * Returns an array with the specified number of rows and columns
     * containing the characters from str in row-major order. If str.length()
     * is greater than rows * cols, extra characters are ignored. If
     * str.length() is less than rows * cols, the remaining elements in the
     * returned array contain null.
     * 
     * @param str the string to be placed in an array
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columsn in the array to be returned
     * @return an array containing the characters from str in row-major order
     */
    public static String[][] fillRowMajor(String str, int rows, int cols)
    {
        String[][] mat = new String[rows][cols];
        
        int sIndex = 0;
        for(int r = 0; r < mat.length; r++)
        {
            for(int c = 0; c < mat[r].length; c++)
            {
                if(sIndex < str.length())
                {
                    mat[r][c] = str.substring(sIndex, sIndex + 1);
                    sIndex++;
                }
            }
        }
        
        return mat;
    }
    
    /**
     * Returns an array containing the elements of vals in column-major order.
     * 
     * Precondition: vals.length == rows * cols
     * 
     * @param vals the elements
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columns in the array to be returned
     * @return an array containing the elements of vals in column-major order
     */
    public static int[][] fillColumnMajor(int[] vals, int rows, int cols)
    {
        int[][] mat = new int[rows][cols];
        
        int vIndex = 0;
        for(int c = 0; c < mat[0].length; c++)
        {
            for(int r = 0; r < mat.length; r++)
            {
                mat[r][c] = vals[vIndex];
                vIndex++;
            }
        }
        
        return mat;
    }
    
    /**
     * Returns an array with the specified number of rows and columns that
     * contains the elements of vals in the order specified below. Elements
     * from vals are placed in the array by moving down the first column,
     * up the second column and so on.
     * 
     * For example, if vals was:
     * {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
     * 
     * rows was 3 and cols was 4,
     * the returned array would be:
     * { {1, 6, 7, 12},
     *   {2, 5, 8, 11},
     *   {3, 4, 9, 10} }
     * 
     * Precondition: vals.length == rows * cols
     * 
     * @param vals the elements
     * @param rows the number of rows in the array to be returned
     * @param cols the number of columns in the array to be returned
     * @return an array containing the elements from vals in the specified order
     */
    public static int[][] fillDownUp(int[] vals, int rows, int cols)
    {
        int[][] mat = new int[rows][cols];
        
        int vIndex = 0;
        
        for(int c = 0; c < mat[0].length; c++)
        {
            for(int r = 0; r < mat.length; r++)
            {
                if(c % 2 == 0)
                    mat[r][c] = vals[vIndex];
                else
                    mat[mat.length - r - 1][c] = vals[vIndex];
                
                vIndex++;
            }
        }
        
        return mat;
    }

// // precondition: vals.length == rows * cols
//    public static int[][] fillDiagonalOrder(int[] vals, int rows, int cols)
//    {
////        return null; // TODO: implement
//        
//        int[][] mat = new int[rows][cols];
//        
//        int matRow = 0;
//        int matCol = mat[0].length - 1;
//        
//        for(int vIndex = 0; vIndex < vals.length; vIndex++)
//        {
//            mat[matRow][matCol] = vals[vIndex];
//            
//            
//        }
//    }
    
    // TODO: add treating a 2D array as an array of 1D arrays
}