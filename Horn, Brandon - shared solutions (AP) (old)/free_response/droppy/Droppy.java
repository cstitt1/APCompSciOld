package droppy;

public class Droppy
{
    /** board[r][c] represents the item in row r and column c on the board.
     *  Empty spots are represented by null. Guaranteed to contain at least 1 spot. */
    private String[][] board;

    /** the column under which the player is positioned */
    private int playerCol;

    /** the number of points earned by the player */
    private int playerPoints;

    /** the number of turns remaining before the game ends */
    private int turnsLeft;

    /** Updates the game state based on the player catching the specified item.
     *  Prints the phrase: "Player caught " followed by the item's description.
     *  @param item the item caught by the player
     *  Precondition: item != null
     */
    private void handleCaughtItem(String item)
    {
        int space = item.indexOf(" ");
        String description = item.substring(0, space);
        System.out.println("Player caught " + description);

        String type = item.substring(space + 1);
        if (type.equals("food"))
            turnsLeft += 10;
        else if (type.equals("prize"))
            playerPoints++;
        else
            playerPoints--;
    }

    /** Moves each item on the board 1 row below its previous location.
     *  Items on the last row are removed from the board. If an item in
     *  column playerCol is removed from the board it is caught by the player.
     *  Updates the game state if an item is caught by the player.
     *  Postcondition: the value of playerCol is unchanged
     */
    public void shiftAndCatch()
    {
        int lastRow = board.length - 1;
        if (board[lastRow][playerCol] != null)
            handleCaughtItem(board[lastRow][playerCol]);

        for (int row = lastRow; row > 0; row--)
        {
            for (int col = 0; col < board[row].length; col++)
            {
                board[row][col] = board[row - 1][col];
                board[row - 1][col] = null;
            }
        }
    }

    // There may be instance variables, constructors and methods that are not shown.
}