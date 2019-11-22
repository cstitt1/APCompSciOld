package p2_9;

public class P2_9
{
	public static void main(String[] args)
	{
		String original = "Mississippi";
		String encoded = original.replace("i", "!");
		encoded = encoded.replace("s", "$");
		System.out.println(original);
		System.out.println(encoded);
	}
}
