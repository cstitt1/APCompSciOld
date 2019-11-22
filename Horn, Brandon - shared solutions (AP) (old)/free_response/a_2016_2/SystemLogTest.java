package a_2016_2;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class SystemLogTest extends TestCase
{
    public void testRemoveMessagesWithExample()
    {
        SystemLog theLog = new SystemLog();
        theLog.messageList = new ArrayList<LogMessage>();
        theLog.messageList.add(new LogMessage("CLIENT3:security alert – repeated login failures"));
        theLog.messageList.add(new LogMessage("Webserver:disk offline"));
        theLog.messageList.add(new LogMessage("SERVER1:file not found"));
        theLog.messageList.add(new LogMessage("SERVER2:read error on disk DSK1"));
        theLog.messageList.add(new LogMessage("SERVER1:write error on disk DSK2"));
        theLog.messageList.add(new LogMessage("Webserver:error on /dev/disk"));
        
        ArrayList<LogMessage> expectedReturnedList = new ArrayList<LogMessage>();
        expectedReturnedList.add(new LogMessage("Webserver:disk offline"));
        expectedReturnedList.add(new LogMessage("SERVER2:read error on disk DSK1"));
        expectedReturnedList.add(new LogMessage("SERVER1:write error on disk DSK2"));

        ArrayList<LogMessage> expectedContentsOfLogList = new ArrayList<LogMessage>();
        expectedContentsOfLogList.add(new LogMessage("CLIENT3:security alert – repeated login failures"));
        expectedContentsOfLogList.add(new LogMessage("SERVER1:file not found"));
        expectedContentsOfLogList.add(new LogMessage("Webserver:error on /dev/disk"));
        
        List<LogMessage> actualReturnedList = theLog.removeMessages("disk");
        
        assertTrue(expectedReturnedList.equals(actualReturnedList));
        assertTrue(theLog.messageList.equals(expectedContentsOfLogList));
    }
}
