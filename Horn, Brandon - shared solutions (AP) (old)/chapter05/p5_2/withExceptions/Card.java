package p5_2.withExceptions;

/**
 * Represents a single standard playing card.
 * Note: The use of exceptions is not required in Chapter 6.
 * An alternative would be to use "-" to represent invalid input.
 */
public class Card
{
    private String description;

    /**
     * Constructs a Card object from the encoded representation.
     * The parameter should be in the format:
     *      <VALUE><SUIT>
     *      Where <VALUE> is one of: "A", "J", "Q", "K" or a string representation of an integer from 2 to 10, inclusive
     *      and <SUIT> is one of: "D", "H", "S", "C".
     * 
     * @param letters the encoded representation of the card
     * @throws IllegalArgumentException if letters does not follow prescribed format
     */
    public Card(String letters)
    {
        String value, suit;

        // split value and suit
        if(letters.length() == 2) // 1 digit value
        {
            value = letters.substring(0,1);
            suit = letters.substring(1,2);
        }
        else if(letters.length() == 3) // 2 digit value
        {
            value = letters.substring(0,2);
            suit = letters.substring(2,3);
        }
        else // invalid input
            throw new IllegalArgumentException("Too many characters in parameter");
        
        // handle value
        if(value.equals("A"))
            description = "Ace";
        else if(value.equals("J"))
            description = "Jack";
        else if(value.equals("Q"))
            description = "Queen";
        else if(value.equals("K"))
            description = "King";
        else // value is numeric or invalid
        {
            try
            {
                int num = Integer.parseInt(value);

                if(2 <= num && num <= 10)
                    description = "" + num;
                else
                    throw new IllegalArgumentException("Value in invalid format");
            }
            catch(NumberFormatException e) // value is invalid
            {
                throw new IllegalArgumentException("Value in invalid format");
            }
        }
        
        description += " of ";
        
        // handle suit
        if(suit.equals("D"))
            description += "diamonds";
        else if(suit.equals("H"))
            description += "hearts";
        else if(suit.equals("S"))
            description += "spades";
        else if(suit.equals("C"))
            description += "clubs";
        else
            throw new IllegalArgumentException("Suit in invalid format");
    }
    
    /**
     * Returns a description of the card.
     * @return a description of the card
     */
    public String getDescription()
    {
        return description;
    }
}