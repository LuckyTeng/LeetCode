package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionGroupAnagrams;

public class SolutionGroupAnagramsTest {
    @Test
    public void testGroupAnagrams() {
        var s = new SolutionGroupAnagrams();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        var actuals = s.groupAnagrams(strs);

        String[][] expecteds = { {"bat"}, {"nat", "tan"}, {"ate", "eat", "tea"}};
        assertEquals(expecteds.length, actuals.size());
        
        int j = 0;
        for ( var list : actuals ) {
            for (int i = 0; i < list.size(); i++) {
                assertEquals(list.get(i), actuals.get(j).get(i));
            }
            j++;
        }
    }

    @Test
    public void testGroupAnagrams1() {
        var s = new SolutionGroupAnagrams();

        String[] strs = {"a"};
        var actuals = s.groupAnagrams(strs);

        String[][] expecteds = { {"a"} };
        assertEquals(expecteds.length, actuals.size());
        
        int j = 0;
        for ( var list : actuals ) {
            for (int i = 0; i < list.size(); i++) {
                assertEquals(list.get(i), actuals.get(j).get(i));
            }
            j++;
        }
    }

    @Test
    public void testGroupAnagrams2() {
        var s = new SolutionGroupAnagrams();

        String[] strs = {""};
        var actuals = s.groupAnagrams(strs);

        String[][] expecteds = { {""} };
        assertEquals(expecteds.length, actuals.size());
        
        int j = 0;
        for ( var list : actuals ) {
            for (int i = 0; i < list.size(); i++) {
                assertEquals(list.get(i), actuals.get(j).get(i));
            }
            j++;
        }
    }
}
