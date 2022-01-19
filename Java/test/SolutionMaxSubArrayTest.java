package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.SolutionMaxSubArray;

public class SolutionMaxSubArrayTest {
    @Test
    public void testMaxSubArray() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        var s = new SolutionMaxSubArray();

        var actual = s.MaxSubArray(nums);
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxSubArray1() {
        int[] nums = {-2, -1};

        var s = new SolutionMaxSubArray();

        var actual = s.MaxSubArray(nums);
        int expected = -1;

        assertEquals(expected, actual);
    }
}
