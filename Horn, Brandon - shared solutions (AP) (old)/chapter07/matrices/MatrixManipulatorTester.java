package matrices;

public class MatrixManipulatorTester
{
    public static void main(String[] args)
    {
        testSum();
        testScalarMultiplication();
        testRowColMultiplication();
        testMultiplication();
    }

    public static void testSum()
    {
        int[][] first = new int[2][5];
        int[][] second = new int[2][5];

        int num = 0;

        for (int row = 0; row < first.length; row++)
            for (int col = 0; col < first[0].length; col++)
            {
                first[row][col] = ++num;
                second[row][col] = num + 10;
            }

        int[][] sum = MatrixManipulator.add(first, second);

        printMatrix(first);
        System.out.println("+");
        printMatrix(second);
        System.out.println("=");
        printMatrix(sum);
    }

    public static void testScalarMultiplication()
    {
        int[][] matrix = new int[2][5];
        int scalar = 2;

        int num = 0;

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[0].length; col++)
                matrix[row][col] = ++num;

        int[][] scalarProduct = MatrixManipulator.multiplyByScalar(scalar,
                matrix);

        printMatrix(matrix);
        System.out.println("*");
        System.out.println(scalar);
        System.out.println("=");
        printMatrix(scalarProduct);
    }

    public static void testRowColMultiplication()
    {
        int[][] first = new int[3][4];
        int[][] second = new int[4][2];

        int num = 20;

        for (int row = 0; row < first.length; row++)
            for (int col = 0; col < first[0].length; col++)
                first[row][col] = num++;

        for (int row = 0; row < second.length; row++)
            for (int col = 0; col < second[0].length; col++)
                second[row][col] = num++;

        int product = MatrixManipulator.multiply(first, 0, second, 0);
        System.out.println("first:");
        printMatrix(first);
        System.out.println("\nsecond:");
        printMatrix(second);
        System.out.println();
        System.out.println("MatrixManipulator.multiply(first, 0, second, 0):");
        System.out.println(product);

        product = MatrixManipulator.multiply(first, 0, second, 1);
        System.out
                .println("\nMatrixManipulator.multiply(first, 0, second, 1):");
        System.out.println(product);

        product = MatrixManipulator.multiply(first, 1, second, 0);
        System.out
                .println("\nMatrixManipulator.multiply(first, 1, second, 0):");
        System.out.println(product);

        product = MatrixManipulator.multiply(first, 1, second, 1);
        System.out
                .println("\nMatrixManipulator.multiply(first, 1, second, 1):");
        System.out.println(product);
    }

    public static void testMultiplication()
    {
        int[][] first = new int[3][4];
        int[][] second = new int[4][2];

        int num = 20;

        for (int row = 0; row < first.length; row++)
            for (int col = 0; col < first[0].length; col++)
                first[row][col] = num++;

        for (int row = 0; row < second.length; row++)
            for (int col = 0; col < second[0].length; col++)
                second[row][col] = num++;

        int[][] product = MatrixManipulator.multiply(first, second);

        printMatrix(first);
        System.out.println("*");
        printMatrix(second);
        System.out.println("=");
        printMatrix(product);
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int row = 0; row < matrix.length; row++)
            System.out.println(java.util.Arrays.toString(matrix[row]));
    }
}
