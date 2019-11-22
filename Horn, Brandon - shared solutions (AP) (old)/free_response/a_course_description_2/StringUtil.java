package a_course_description_2;

import java.util.ArrayList;
import java.util.List;

public class StringUtil
{
    public static void main(String[] args)
    {
        System.out.println(apcsReplaceAll("to be or not to be", "to", "2"));
        System.out.println(apcsReplaceAll("gogogo", "go", "gone"));
        System.out.println(apcsReplaceAll("aaaaa", "aaa", "b"));
        
        System.out.println(apcsReplaceAllAlt("to be or not to be", "to", "2"));
        System.out.println(apcsReplaceAllAlt("gogogo", "go", "gone"));
        System.out.println(apcsReplaceAllAlt("aaaaa", "aaa", "b"));
        
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Henry", "Hank"));
        people.add(new Person("Elizabeth", "Liz"));
        people.add(new Person("John", "Jack"));
        people.add(new Person("Margaret", "Peggy"));
        
        String str = "After Henry drove Elizabeth to dinner in Johnson City, Henry " +
                "paid for an appetizer and Elizabeth paid for dessert.";
        
        System.out.println(replaceNameNickName(str, people));
    }
    
    public static String apcsReplaceAll(String str,
            String oldStr, String newStr)
    {
        String result = str;
        int i = 0;
        while(i <= result.length() - oldStr.length())
        {
            if(result.substring(i,  i + oldStr.length()).equals(oldStr))
            {
                result = result.substring(0, i) +
                        newStr +
                        result.substring(i + oldStr.length());
                
                i += newStr.length();
            }
            else
                i++;
        }
        
        return result;
    }

    public static String apcsReplaceAllAlt(String str,
            String oldStr, String newStr)
    {
        if(str.length() < oldStr.length())
            return str;
        
        if(str.substring(0, oldStr.length()).equals(oldStr))
            return newStr + apcsReplaceAllAlt(str.substring(oldStr.length()), oldStr, newStr);
        else
            return str.substring(0, 1) + apcsReplaceAllAlt(str.substring(1), oldStr, newStr);
    }

    public static String replaceNameNickName(String str,
            List<Person> people)
    {
        String result = str;
        
        for(Person p : people)
            result = apcsReplaceAll(result, p.getFirstName(), p.getNickName());
        
        return result;
    }
}
