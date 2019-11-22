package a_2016_2;

import junit.framework.TestCase;

public class LogMessageTest extends TestCase
{
    public void testConstructorWithExamples()
    {
        LogMessage lm = new LogMessage("CLIENT3:security alert – repeated login failures");
        assertTrue(lm.getMachineId().equals("CLIENT3"));
        assertTrue(lm.getDescription().equals("security alert – repeated login failures"));
        
        lm = new LogMessage("Webserver:disk offline");
        assertTrue(lm.getMachineId().equals("Webserver"));
        assertTrue(lm.getDescription().equals("disk offline"));
        
        lm = new LogMessage("SERVER1:file not found");
        assertTrue(lm.getMachineId().equals("SERVER1"));
        assertTrue(lm.getDescription().equals("file not found"));
        
        lm = new LogMessage("SERVER2:read error on disk DSK1");
        assertTrue(lm.getMachineId().equals("SERVER2"));
        assertTrue(lm.getDescription().equals("read error on disk DSK1"));
        
        lm = new LogMessage("SERVER1:write error on disk DSK2");
        assertTrue(lm.getMachineId().equals("SERVER1"));
        assertTrue(lm.getDescription().equals("write error on disk DSK2"));
        
        lm = new LogMessage("Webserver:error on /dev/disk");
        assertTrue(lm.getMachineId().equals("Webserver"));
        assertTrue(lm.getDescription().equals("error on /dev/disk"));
    }

    public void testContainsWordWithPositiveExamples()
    {
        String[] descriptions = {
                "disk",
                "error on disk",
                "error on /dev/disk disk",
                "error on disk DSK1"
        };
        
        for(String description : descriptions)
        {
            LogMessage lm = new LogMessage("machine:" + description);
            assertTrue(lm.containsWord("disk"));
        }
    }
    
    public void testContainsWordWithNegativeExamples()
    {
        String[] descriptions = {
                "DISK",
                "error on disk3",
                "error on /dev/disk",
                "diskette"
        };
        
        for(String description : descriptions)
        {
            LogMessage lm = new LogMessage("machine:" + description);
            assertFalse(lm.containsWord("disk"));
        }
    }
}
