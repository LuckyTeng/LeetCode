package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionLongestConsecutiveSequence;

public class SolutionLongestConsecutiveSequenceTest {
    @Test
    public void testLongestConsecutive() {
        var s = new SolutionLongestConsecutiveSequence();

        int[] nums = {100,4,200,1,3,2};
        var actual = s.longestConsecutive(nums);

        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testLongestConsecutive1() {
        var s = new SolutionLongestConsecutiveSequence();

        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        var actual = s.longestConsecutive(nums);

        int expected = 9;

        assertEquals(expected, actual);
    }
}
