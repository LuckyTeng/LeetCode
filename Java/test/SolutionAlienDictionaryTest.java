package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionAlienDictionary;

public class SolutionAlienDictionaryTest {
    @Test
    public void testAlienOrder() {
        var sol = new SolutionAlienDictionary();

        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};

        var actual = sol.alienOrder(words);
        String expected = "wertf";

        assertEquals(expected, actual);
    }

    @Test
    public void testAlienOrder1() {
        var sol = new SolutionAlienDictionary();

        String[] words = {"z", "x"};

        var actual = sol.alienOrder(words);
        String expected = "zx";

        assertEquals(expected, actual);
    }

    @Test
    public void testAlienOrder2() {
        var sol = new SolutionAlienDictionary();

        String[] words = {"z", "x", "z"};

        var actual = sol.alienOrder(words);
        String expected = "";

        assertEquals(expected, actual);
    }
}
