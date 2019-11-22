package a_course_description_2;

public class Person
{
    private String firstName, nickName;
    
    public Person(String first, String nick)
    {
        firstName = first;
        nickName = nick;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getNickName()
    {
        return nickName;
    }
}