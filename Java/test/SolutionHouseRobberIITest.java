package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionHouseRobberII;

public class SolutionHouseRobberIITest {
    @Test
    public void testRob() {
        var sol = new SolutionHouseRobberII();

        int[] nums = {2, 3, 2};

        var actual = sol.rob(nums);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testRob1() {
        var sol = new SolutionHouseRobberII();

        int[] nums = {1, 2, 3, 1};

        var actual = sol.rob(nums);
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    public void testRob2() {
        var sol = new SolutionHouseRobberII();

        int[] nums = {1, 2, 3};

        var actual = sol.rob(nums);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testRob3() {
        var sol = new SolutionHouseRobberII();

        int[] nums = {1};
        var actual = sol.rob(nums);
        int expected = 1;

        assertEquals(expected, actual);
    }
}
