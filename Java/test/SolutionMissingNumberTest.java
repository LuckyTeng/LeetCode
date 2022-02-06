package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionMissingNumber;

public class SolutionMissingNumberTest {
    @Test
    public void testMissingNumber() {
        var sol = new SolutionMissingNumber();

        int[] nums = {3,0,1};

        var actual = sol.missingNumber(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingNumber1() {
        var sol = new SolutionMissingNumber();

        int[] nums = {0,1};

        var actual = sol.missingNumber(nums);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testMissingNumber2() {
        var sol = new SolutionMissingNumber();

        int[] nums = {9,6,4,2,3,5,7,0,1};

        var actual = sol.missingNumber(nums);
        int expected = 8;
        assertEquals(expected, actual);
    }
}
