package r4_12;

public class StringFun
{
	public static void main(String[] args)
	{
		String s = "hamster";
		
		String first = s.substring(0,1);
		System.out.println(first);
		
		String last = s.substring(s.length()-1);
		System.out.println(last);
		
		String allButFirst = s.substring(1);
		System.out.println(allButFirst);
		
		String allButLast = s.substring(0, s.length()-1);
		System.out.println(allButLast);
	}

}
