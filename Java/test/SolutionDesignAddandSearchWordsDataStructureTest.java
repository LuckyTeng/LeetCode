package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionDesignAddandSearchWordsDataStructure;
import src.SolutionDesignAddandSearchWordsDataStructure.WordDictionary;

public class SolutionDesignAddandSearchWordsDataStructureTest {
    @Test
    public void testWordDictionary() {
        var sol = new SolutionDesignAddandSearchWordsDataStructure();

        WordDictionary wd = sol.new WordDictionary();

        wd.addWord("bad");
        wd.addWord("dad");
        wd.addWord("mad");

        var actual = wd.search("pad");
        assertEquals(false, actual);

        actual = wd.search("bad");
        assertEquals(true, actual);

        actual = wd.search(".ad");
        assertEquals(true, actual);

        actual = wd.search("b..");
        assertEquals(true, actual);
    }

    @Test
    public void testWordDictionary1() {
        var sol = new SolutionDesignAddandSearchWordsDataStructure();

        WordDictionary wd = sol.new WordDictionary();

        wd.addWord("at");
        wd.addWord("and");
        wd.addWord("an");
        wd.addWord("add");

        var actual = wd.search("a");
        assertEquals(false, actual);

        actual = wd.search(".at");
        assertEquals(false, actual);

        wd.addWord("bat");

        actual = wd.search(".at");
        assertEquals(true, actual);

        actual = wd.search("an.");
        assertEquals(true, actual);

        actual = wd.search("a.d.");
        assertEquals(false, actual);

        actual = wd.search("b.");
        assertEquals(false, actual);

        actual = wd.search("a.d");
        assertEquals(true, actual);

        actual = wd.search(".");
        assertEquals(false, actual);
    }
}
