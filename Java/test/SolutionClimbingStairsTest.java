package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionClimbingStairs;

public class SolutionClimbingStairsTest {
    @Test
    public void testClimbStairs() {
        var s = new SolutionClimbingStairs();

        var actual = s.climbStairs(2);

        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void testClimbStairs1() {
        var s = new SolutionClimbingStairs();

        var actual = s.climbStairs(3);

        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testClimbStairs2() {
        var s = new SolutionClimbingStairs();

        var actual = s.climbStairs(1);

        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testClimbStairs3() {
        var s = new SolutionClimbingStairs();

        var actual = s.climbStairs(4);

        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testClimbStairs4() {
        var s = new SolutionClimbingStairs();

        var actual = s.climbStairs(33);

        int expected = 5702887;
        assertEquals(expected, actual);
    }
}


