package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionJumpGame;

public class SolutionJumpGameTest {
    @Test
    public void testCanJump() {
        var s = new SolutionJumpGame();

        int[] nums = {2,3,1,1,4};
        var actual = s.CanJump(nums);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testCanJump1() {
        var s = new SolutionJumpGame();

        int[] nums = {3,2,1,0,4};
        var actual = s.CanJump(nums);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void testCanJump2() {
        var s = new SolutionJumpGame();

        int[] nums = {2,0};
        var actual = s.CanJump(nums);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testCanJump3() {
        var s = new SolutionJumpGame();

        int[] nums = {0};
        var actual = s.CanJump(nums);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testCanJump4() {
        var s = new SolutionJumpGame();

        int[] nums = {1};
        var actual = s.CanJump(nums);
        boolean expected = true;

        assertEquals(expected, actual);
    }
}
