package src;

public class SolutionImplementTrie {
    public class Trie {

        public class TrieNode {
            private final int R = 26;

            public TrieNode[] links;

            private boolean isEnd;

            public TrieNode() {
                links = new TrieNode[R];
            }

            // public boolean containsKey(char c) {
            //     return links[c - 'a'] != null;
            // }
            // public TrieNode get(char c) {
            //     return links[c - 'a'];
            // }

            // public void put(char c, TrieNode node) {
            //     links[c - 'a'] = node;
            // }

            public boolean isEnd() {
                return isEnd;
            }

            public void setEnd() {
                isEnd = true;
            }
        }

        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode curr = root;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if ( curr.links[c - 'a'] == null )
                    curr.links[c - 'a'] = new TrieNode();
                curr = curr.links[c - 'a'];
            }
            curr.setEnd();
        }

        private TrieNode searchPrefix(String word) {
            TrieNode node = root;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if ( node.links[c - 'a'] == null ) return null;
                node = node.links[c - 'a'];
            }
            return node;
        }

        public boolean search(String word) {
            TrieNode node = searchPrefix(word);
            return node != null && node.isEnd();
        }

        

        public boolean startsWith(String prefix) {
            TrieNode node = searchPrefix(prefix);
            return node != null;
        }
    }
}
