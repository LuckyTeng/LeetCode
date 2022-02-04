package src;

import java.util.Stack;

@LeetCodeInformation(Number = 211, Url = "https://leetcode.com/problems/design-add-and-search-words-data-structure/")
public class SolutionDesignAddandSearchWordsDataStructure {
    public class WordDictionary {

        private class TrieNode {
            private boolean isEnd;
            private TrieNode[] links;
            private final int R = 26;

            public TrieNode() {
                links = new TrieNode[R];
            }
        }

        TrieNode root;

        public WordDictionary() {
           root = new TrieNode();
        }
        
        public void addWord(String word) {
            TrieNode node = root;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if ( node.links[c - 'a'] == null )
                    node.links[c - 'a'] = new TrieNode();
                
                node = node.links[c - 'a'];
            }

            node.isEnd = true;
        }
        
        public boolean search(String word) {
            Stack<TrieNode> stack = new Stack<>();
            stack.push(root);

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if ( c == '.' ) {
                    Stack<TrieNode> temp = new Stack<>();
                    while (!stack.isEmpty()) {
                        TrieNode node = stack.pop();
                        for (int j = 0; j < 26; j++) {
                            if ( node.links[j] != null )
                                temp.push(node.links[j]);
                        }
                    }
                    stack = temp;
                } else {
                    Stack<TrieNode> temp = new Stack<>();
                    while (!stack.isEmpty()) {
                        TrieNode node = stack.pop();
                        if ( node.links[c - 'a'] != null ) {
                            temp.push(node.links[c - 'a']);
                        }
                    }
                    stack = temp;
                }
            }

            boolean result = false;
            while (!stack.isEmpty()) {
                if ( stack.pop().isEnd )
                    result = true;
            }
            return result;
        }
    }
}
