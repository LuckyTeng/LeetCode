package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionRemoveAllAdjacentDuplicatesInString;

public class SolutionRemoveAllAdjacentDuplicatesInStringTest {
    @Test
    public void testRemoveDuplicates() {
        var sol = new SolutionRemoveAllAdjacentDuplicatesInString();

        var s = "abbaca";

        var actual = sol.removeDuplicates(s);
        String expected = "ca";

        assertEquals(expected, actual);
    }

    
    @Test
    public void testRemoveDuplicates1() {
        var sol = new SolutionRemoveAllAdjacentDuplicatesInString();

        var s = "azxxzy";

        var actual = sol.removeDuplicates(s);
        String expected = "ay";

        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates2() {
        var sol = new SolutionRemoveAllAdjacentDuplicatesInString();

        var s = "aaaaaaaa";

        var actual = sol.removeDuplicates(s);
        String expected = "";

        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicates3() {
        var sol = new SolutionRemoveAllAdjacentDuplicatesInString();

        var s = "abbbabaaa";

        var actual = sol.removeDuplicates(s);
        String expected = "ababa";

        assertEquals(expected, actual);
    }
}
