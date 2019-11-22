package a_2017_3;

import java.util.ArrayList;
import java.util.List;

public class Phrase
{
    private String currentPhrase;
    
    public Phrase(String p)
    {
        currentPhrase = p;
    }
    
    public static List<Integer> findKeyword(String str, String keyword)
    {
        ArrayList<Integer> positions = new ArrayList<Integer>();
        
        int pos = str.indexOf(keyword);
        
        while(pos != -1)
        {
            positions.add(pos);
            pos = str.indexOf(keyword, pos + 1);
        }
        
        return positions;
    }
    
    public int findNthOccurrence(String str, int n)
    {
        List<Integer> indexes = findKeyword(currentPhrase, str);
        if(n - 1 >= indexes.size())
            return -1;
        
        return indexes.get(n - 1);
    }
    
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        int index = findNthOccurrence(str, n);
        
        if(index != -1)
        {
            currentPhrase = currentPhrase.substring(0, index) + repl +
                    currentPhrase.substring(index + str.length());
        }
    }
    
    public int findLastOccurrence(String str)
    {
        return currentPhrase.lastIndexOf(str);
    }
    
    public String toString()
    {
        return currentPhrase;
    }
}
