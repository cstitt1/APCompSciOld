package recursiveMethodAnalysis;

public class Mine
{
    public static int countOddDigits(int n)
    {
        if(n == 0)
            return 0;
        
        if(n % 2 == 1)
            return 1 + countOddDigits(n / 10);
        else
            return countOddDigits(n / 10);
    }
    
    public static int countOddDigitsAlt(int n)
    {
        if(n == 0)
            return 0;
        
        int oddDigits = countOddDigitsAlt(n / 10);
        
        if(n % 2 == 1)
            oddDigits++;
        
        return oddDigits;
    }
    
    public static int sumEvenDigits(int n)
    {
        if(n == 0)
            return 0;
        
        if(n % 2 == 0)
            return n % 10 + sumEvenDigits(n / 10);
        else
            return sumEvenDigits(n / 10);
    }
    
    public static int sumEvenDigitsAlt(int n)
    {
        if(n == 0)
            return 0;
        
        int sum = sumEvenDigits(n / 10);
        
        if(n % 2 == 0)
            sum += n % 10;
        
        return sum;
    }
    
    // note: overlapping matches count repeatedly
    public static int countMatches(String str, String pattern)
    {
        if(str.length() < pattern.length())
            return 0;
        
        int matches = countMatches(str.substring(1), pattern);
        
        if(str.substring(0, pattern.length()).equals(pattern))
            matches++;
        
        return matches;
    }
    
    public static String swapAllCapitalsToLowerCase(String str)
    {
        return null; // TODO: implement
    }
    
    public static String replace(String str, String oldPattern, String newPattern)
    {
        if(str.length() < oldPattern.length())
            return str;
        
        if(str.substring(0, oldPattern.length()).equals(oldPattern))
            return newPattern + replace(str.substring(oldPattern.length()), oldPattern, newPattern);
        else
            return str.substring(0, 1) + replace(str.substring(1), oldPattern, newPattern);
    }
    
    public static int countNegatives(int[] arr)
    {
        return countNegatives(arr, 0);
    }
    
    private static int countNegatives(int[] arr, int index)
    {
        if(index >= arr.length)
            return 0;
        
        int count = countNegatives(arr, index + 1);
        
        if(arr[index] < 0)
            count++;
        
        return count;
    }
    
    public static void constrain(int[] arr, int min, int max)
    {
        constrain(arr, min, max, 0);
    }
    
    private static void constrain(int[] arr, int min, int max, int index)
    {
        if(index >= arr.length)
            return;
        
        if(arr[index] < min)
            arr[index] = min;
        
        if(arr[index] > max)
            arr[index] = max;
        
        constrain(arr, min, max, index + 1);
    }
    
    // [1, 2, 3, 4] returns [1, 2, 3, 4, 1, 2, 3, 4]
    public static int[] duplicateAll(int[] arr)
    {
        int[] newArr = new int[arr.length * 2];
        duplicateAll(arr, newArr, 0);
        return newArr;
    }
    
    private static void duplicateAll(int[] oldArr, int[] newArr, int oldIndex)
    {
        if(oldIndex >= oldArr.length)
            return;
        
        newArr[oldIndex] = oldArr[oldIndex];
        newArr[oldArr.length + oldIndex] = oldArr[oldIndex];
        
        duplicateAll(oldArr, newArr, oldIndex + 1);
    }
}