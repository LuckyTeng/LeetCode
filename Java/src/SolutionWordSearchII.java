package src;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInformation(Number = 212, Url = "https://leetcode.com/problems/word-search-ii/")
public class SolutionWordSearchII {

    private class TrieNode {
        public TrieNode[] children;
        public String word;

        public TrieNode() {
            children = new TrieNode[26];
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        List<String> ans = new ArrayList<>();
        
        buildTrieNode(root, words);

        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board[0].length; i++) {
                dfs(i, j, board, root, ans);
            }
        }
        
        return ans;
    }

    private void dfs(int i, int j, char[][] board, TrieNode p, List<String> ans) {
        char c = board[j][i];

        if (c == '#') return;
        if (p.children[c -'a'] == null) return;

        p = p.children[c -'a'];
        if ( p.word != null ) {
            ans.add(p.word);
            p.word = null; // no duplicate answer
        }

        board[j][i] = '#'; // mark current visited
        if ( i > 0 )
            dfs( i-1, j, board, p, ans);
        if ( j > 0 )
            dfs( i, j-1, board, p, ans);
        if ( i < board[0].length - 1)
            dfs( i+1, j, board, p, ans);
        if ( j < board.length - 1)
            dfs( i, j+1, board, p, ans);

        board[j][i] = c; // restore
    }

    private void buildTrieNode(TrieNode root, String[] words) {
        for (int i = 0; i < words.length; i++) {
            TrieNode node = root;
            String word = words[i];

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);

                if ( node.children[c - 'a'] == null ) node.children[c - 'a'] = new TrieNode();
                node = node.children[c - 'a'];
            }
            node.word = word;
        }
    }
}
