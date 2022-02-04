package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionContainsDuplicate;

public class SolutionContainsDuplicateTest {
    @Test
    public void testContainsDuplicate() {
        final var sol = new SolutionContainsDuplicate();

        int[] nums = {1,2,3,1};

        var actual = sol.containsDuplicate(nums);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testContainsDuplicate1() {
        final var sol = new SolutionContainsDuplicate();

        int[] nums = {1,2,3,4};

        var actual = sol.containsDuplicate(nums);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void testContainsDuplicate2() {
        final var sol = new SolutionContainsDuplicate();

        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        var actual = sol.containsDuplicate(nums);
        boolean expected = true;

        assertEquals(expected, actual);
    }
}
