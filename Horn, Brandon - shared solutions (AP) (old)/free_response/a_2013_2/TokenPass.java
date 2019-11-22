package a_2013_2;

public class TokenPass
{
    int[] board; // package access for testing
    int currentPlayer; // package access for testing
    
    TokenPass() // package access constructor for testing
    {
        
    }
    
    public TokenPass(int playerCount)
    {
        board = new int[playerCount];
        for(int i = 0; i < board.length; i++)
            board[i] = (int) (Math.random() * 10 + 1);
        
        currentPlayer = (int) (Math.random() * playerCount);
    }
    
    public void distributeCurrentPlayerTokens()
    {
        int tokens = board[currentPlayer];
        board[currentPlayer] = 0;
        int targetIndex = currentPlayer + 1;
        
        while(tokens > 0)
        {
            if(targetIndex == board.length)
                targetIndex = 0;
            
            board[targetIndex]++;
            tokens--;
            targetIndex++;
        }
    }
}
