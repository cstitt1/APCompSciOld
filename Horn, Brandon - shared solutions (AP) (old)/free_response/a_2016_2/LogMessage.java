package a_2016_2;

public class LogMessage
{
    private String machineId;
    private String description;

    public LogMessage(String message)
    {
        int colonIndex = message.indexOf(":");
        machineId = message.substring(0, colonIndex);
        description = message.substring(colonIndex + 1);
    }

    public boolean containsWord(String keyword)
    {
        int keywordIndex = description.indexOf(keyword);

        while (keywordIndex != -1)
        {
            int beforeIndex = keywordIndex - 1;
            int afterIndex = keywordIndex + keyword.length();

            if ((beforeIndex == -1 || description
                    .substring(beforeIndex, beforeIndex + 1).equals(" "))
                    && (afterIndex == description.length() || description
                            .substring(afterIndex, afterIndex + 1).equals(" ")))
                return true;

            keywordIndex = description.indexOf(keyword, keywordIndex + 1);
        }

        return false;
    }

    public String getMachineId()
    {
        return machineId;
    }

    public String getDescription()
    {
        return description;
    }
    
    // added for testing
    public boolean equals(Object other)
    {
        if( ! (other instanceof LogMessage) )
            return false;
        
        LogMessage otherMessage = (LogMessage) other;
        
        return machineId.equals(otherMessage.machineId) &&
                description.equals(otherMessage.description);
    }
}