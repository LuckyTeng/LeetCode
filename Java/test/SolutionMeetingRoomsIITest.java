package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionMeetingRoomsII;

public class SolutionMeetingRoomsIITest {
    @Test
    public void testSolve() {
        var sol = new SolutionMeetingRoomsII();

        int[][] A = {{0, 30},{5,10},{15,20}};
        var actual = sol.solve(A);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testSolve1() {
        var sol = new SolutionMeetingRoomsII();

        int[][] A = {{1,18},{18,23},{15,29},{4,15},{2,11},{5,13}};
        var actual = sol.solve(A);
        int expected = 4;

        assertEquals(expected, actual);
    }
}
