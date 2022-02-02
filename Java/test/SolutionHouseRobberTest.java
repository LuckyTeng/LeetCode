package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionHouseRobber;

public class SolutionHouseRobberTest {
    @Test
    public void testRob() {
        var sol = new SolutionHouseRobber();

        int[] nums = {1,2,3,1};
        var actual = sol.rob(nums);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testRob1() {
        var sol = new SolutionHouseRobber();

        int[] nums = {2,7,9,3,1};
        var actual = sol.rob(nums);
        int expected = 12;

        assertEquals(expected, actual);
    }
}
