package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionLongestIncreasingSubsequence;

public class SolutionLongestIncreasingSubsequenceTest {
    @Test
    public void testLengthOfLIS() {
        var sol = new SolutionLongestIncreasingSubsequence();

        int[] nums = {10,9,2,5,3,7,101,18};
        
        var actual = sol.LengthOfLIS(nums);
        int expected = 4;
        
        assertEquals(expected, actual);
    }

    @Test
    public void testLengthOfLIS1() {
        var sol = new SolutionLongestIncreasingSubsequence();

        int[] nums = {0,1,0,3,2,3};
        
        var actual = sol.LengthOfLIS(nums);
        int expected = 4;
        
        assertEquals(expected, actual);
    }

    @Test
    public void testLengthOfLIS2() {
        var sol = new SolutionLongestIncreasingSubsequence();

        int[] nums = {7,7,7,7,7,7,7};
        
        var actual = sol.LengthOfLIS(nums);
        int expected = 1;
        
        assertEquals(expected, actual);
    }
}
