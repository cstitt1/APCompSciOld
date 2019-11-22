package p3_8;

public class LetterTester
{

	public static void main(String[] args)
	{
		Letter toClass = new Letter("Mr. Horn", "AP CS Students");
		
		toClass.addLine("Figure it out");
		toClass.addLine("and don't screw it up.");
		
		System.out.println(toClass.getText());
	}
}
