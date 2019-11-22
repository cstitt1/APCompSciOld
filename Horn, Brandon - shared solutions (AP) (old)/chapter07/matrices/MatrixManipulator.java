package matrices;

/**
 * Offers the specified operations on integer matrices.
 */
public class MatrixManipulator
{
    /**
     * Determines if (first + second) is defined where + indicates matrix
     * addition.
     * 
     * @return true if matrix addition is defined, false otherwise.
     */
    public static boolean addable(int[][] first, int[][] second)
    {
        if (!(atLeastOneByOne(first) && atLeastOneByOne(second)))
            return false;

        return first.length == second.length
                && first[0].length == second[0].length;
    }

    /**
     * Performs (first + second) where + indicates matrix addition.
     * (Precondition: addable(first, second) returns true.)
     * 
     * @return the result of first + second.
     * @throws IllegalArgumentException
     *             if the precondition is not met.
     */
    public static int[][] add(int[][] first, int[][] second)
    {
        if (!addable(first, second))
            throw new IllegalArgumentException();

        int[][] sum = new int[first.length][first[0].length];

        for (int row = 0; row < sum.length; row++)
            for (int col = 0; col < sum[0].length; col++)
                sum[row][col] = first[row][col] + second[row][col];

        return sum;
    }

    /**
     * Performs (scalar * matrix) where * indicates scalar multiplication of a
     * matrix. (Precondition: matrix.length > 0 && matrix[0].length > 0)
     * 
     * @return the result of scalar * matrix.
     * @throws IllegalArgumentException
     *             if the precondition is not met.
     */
    public static int[][] multiplyByScalar(int scalar, int[][] matrix)
    {
        if (!atLeastOneByOne(matrix))
            throw new IllegalArgumentException();

        int[][] scalarProduct = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < scalarProduct.length; row++)
            for (int col = 0; col < scalarProduct[0].length; col++)
                scalarProduct[row][col] = matrix[row][col] * scalar;

        return scalarProduct;
    }

    /**
     * Determines if (first * second) is defined where * indicates matrix
     * multiplication.
     * 
     * @return true if matrix multiplication is defined, false otherwise.
     */
    public static boolean multipliable(int[][] first, int[][] second)
    {
        if (!(atLeastOneByOne(first) && atLeastOneByOne(second)))
            return false;

        return first[0].length == second.length;
    }

    /**
     * Performs (first * second) where * indicates matrix multiplication.
     * (Precondition: multipliable(first, second) returns true.)
     * 
     * @return the result of first * second.
     * @throws IllegalArgumentException
     *             if the precondition is not met.
     */
    public static int[][] multiply(int[][] first, int[][] second)
    {
        if (!multipliable(first, second))
            throw new IllegalArgumentException();

        int[][] product = new int[first.length][second[0].length];

        for (int row = 0; row < product.length; row++)
            for (int col = 0; col < product[0].length; col++)
                product[row][col] = multiply(first, row, second, col);

        return product;
    }

    /**
     * Multiplies the specified row of first and the specified column of second.
     * (Precondition: first[row].length > 0 && first[row].length ==
     * second.length)
     * 
     * @return the result of multipliying the specified row and column.
     * @throws IllegalArgumentException
     *             if the precondition is not met.
     */
    public static int multiply(int[][] first, int row, int[][] second, int col)
    {
        if ( ! multipliable(first, second) )
        		throw new IllegalArgumentException();

        int sumOfProducts = 0;

        for (int i = 0; i < first[row].length; i++)
            sumOfProducts += first[row][i] * second[i][col];

        return sumOfProducts;
    }

    private static boolean atLeastOneByOne(int[][] matrix)
    {
        return matrix != null && matrix.length > 0 && matrix[0].length > 0;
    }
}
