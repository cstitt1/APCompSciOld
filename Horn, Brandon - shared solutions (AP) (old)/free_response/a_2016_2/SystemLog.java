package a_2016_2;

import java.util.ArrayList;
import java.util.List;

public class SystemLog
{
    // package access for testing
    List<LogMessage> messageList;

    public List<LogMessage> removeMessages(String keyword)
    {
        ArrayList<LogMessage> removedMessages = new ArrayList<LogMessage>();

        for (int i = 0; i < messageList.size(); i++)
        {
            if (messageList.get(i).containsWord(keyword))
            {
                removedMessages.add(messageList.remove(i));
                i--;
            }
        }

        return removedMessages;
    }
}
