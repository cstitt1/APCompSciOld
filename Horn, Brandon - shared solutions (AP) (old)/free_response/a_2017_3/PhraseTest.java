package a_2017_3;

import junit.framework.TestCase;

public class PhraseTest extends TestCase
{
    public void testReplaceNthOccurrenceWithExamples()
    {
        Phrase phrase1 = new Phrase("A cat ate late.");
        phrase1.replaceNthOccurrence("at", 1, "rane");
        assertTrue(phrase1.toString().equals("A crane ate late."));
        
        Phrase phrase2 = new Phrase("A cat ate late.");
        phrase2.replaceNthOccurrence("at", 6, "xx");
        assertTrue(phrase2.toString().equals("A cat ate late."));
        
        Phrase phrase3 = new Phrase("A cat ate late.");
        phrase3.replaceNthOccurrence("bat", 2, "xx");
        assertTrue(phrase3.toString().equals("A cat ate late."));
        
        Phrase phrase4 = new Phrase("aaaa");
        phrase4.replaceNthOccurrence("aa", 1, "xx");
        assertTrue(phrase4.toString().equals("xxaa"));
        
        Phrase phrase5 = new Phrase("aaaa");
        phrase5.replaceNthOccurrence("aa", 2, "bbb");
        assertTrue(phrase5.toString().equals("abbba"));
    }

    public void testFindLastOccurrenceWithExamples()
    {
        Phrase phrase1 = new Phrase("A cat ate late.");
        assertTrue(phrase1.findLastOccurrence("at") == 11);
        assertTrue(phrase1.findLastOccurrence("cat") == 2);
        assertTrue(phrase1.findLastOccurrence("bat") == -1);
    }
}
