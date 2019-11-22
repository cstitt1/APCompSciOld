package p3_8;

public class Letter
{
	private String header, body, footer;
	
	/**
	 * Constructs a letter with the specified sender
	 * and recipient
	 * @param from the sender
	 * @param to the recipient
	 */
	public Letter(String from, String to)
	{
		header = "Dear " + to + ":\n\n";
		body = "";
		footer = "\nSincerely,\n\n" + from;
	}
	
	/**
	 * Adds the specified line of text to the body of this letter.
	 * @param line the line of text to add
	 */
	public void addLine(String line)
	{
		body += line + "\n";
	}
	
	/**
	 * Returns the text of this letter including heading, body & footer
	 * @return the text of this letter
	 */
	public String getText()
	{
		return header + body + footer;
	}
}
