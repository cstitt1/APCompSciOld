package arrayListPractice;

import java.util.ArrayList;

public class ArrayListPractice
{
    /**
     * Removes all occurrences of wordToRemove from words
     * @param words the word to remove
     * @param wordToRemove the list from which to remove word
     */
    public static void removeWord(ArrayList<String> words, String wordToRemove)
    {
        for(int i = words.size() - 1; i >= 0; i--)
            if(words.get(i).equals(wordToRemove))
                words.remove(i);
        
        // alt 1: go forward and decrement i on removal
        
        // alt 2: use a while loop and only increment i when you don't remove
//        int i = 0;
//        while(i < words.size())
//        {
//            if(words.get(i).equals(wordToRemove))
//                words.remove(i);
//            else
//                i++;
//        }
    }
    
    /**
     * Duplicates each element in list that matches elem. Each duplicate
     * element is adjacent to the original element. 
     * @param list the list from which to duplicate elements
     * @param elem the element to duplicate
     */
    public static void duplicateMatching(ArrayList<Integer> list, Integer elem)
    {
        for(int i = list.size() - 1; i >= 0; i--)
            if(list.get(i).equals(elem))
                list.add(i, elem);
    }
    
    /**
     * Removes all adjacent duplicate elements from list.
     * 
     * For example, if list was:
     * [5, 7, 7, 5, 3, 7, 7, 7, 8, 7, 7, 7, 7]
     * 
     * list would become:
     * [5, 7, 5, 3, 7, 8, 7]
     * 
     * @param list the list from which to remove elements
     */
    public static void removeAdjacentDuplicates(ArrayList<Integer> list)
    {
        int i = 1;
        while(i < list.size())
        {
            if(list.get(i - 1).equals(list.get(i)))
                list.remove(i);
            else
                i++;
        }
    }
}