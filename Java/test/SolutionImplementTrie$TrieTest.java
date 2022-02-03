package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import src.SolutionImplementTrie;
import src.SolutionImplementTrie.Trie;

public class SolutionImplementTrie$TrieTest {
    @Test
    public void testTrie() {
        SolutionImplementTrie sol = new SolutionImplementTrie();
        Trie trie = sol.new Trie();

        assertNotNull(trie);

        trie.insert("apple");
        var actual = trie.search("apple");
        boolean expected = true;

        assertEquals(expected, actual);

        actual = trie.search("app");
        expected = false;
        
        assertEquals(expected, actual);

        actual = trie.startsWith("app");
        expected = true;

        assertEquals(expected, actual);

        trie.insert("app");

        actual = trie.search("app");
        expected = true;

        assertEquals(expected, actual);
    }
}
