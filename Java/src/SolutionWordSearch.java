package src;

@LeetCodeInformation(Number = 79, Url = "https://leetcode.com/problems/word-search/")
public class SolutionWordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    backtrack(board, word, 0, i, j, m, n);
                } catch (CorrectException e) {
                    return true;
                }
            }
        }
         
        return false;
    }

    class CorrectException extends Exception {

    }

    private void backtrack(char[][] board, String word, int wordPos, int i, int j, int m, int n) throws CorrectException
    {
        // check boundary
        if ( i >= m || j >= n || i < 0 || j < 0 )
            return;
        if ( board[i][j] == '*' )
            return;
        if ( board[i][j] == word.charAt(wordPos)) {
            if ( wordPos == word.length() - 1)
                throw new CorrectException();
            char temp = board[i][j];
            board[i][j] = '*';
            backtrack(board, word, wordPos + 1, i+1, j, m, n);
            backtrack(board, word, wordPos + 1, i, j-1, m, n);
            backtrack(board, word, wordPos + 1, i-1, j, m, n);
            backtrack(board, word, wordPos + 1, i, j+1, m, n);
            board[i][j] = temp;
        }
    }
}
