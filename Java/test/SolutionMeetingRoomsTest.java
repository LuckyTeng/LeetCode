package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionMeetingRooms;

public class SolutionMeetingRoomsTest {
    @Test
    public void testSolve() {
        var sol = new SolutionMeetingRooms();

        int[][] A = {{0, 30},{5,10},{15,20}};
        var actual = sol.canAttendMeetings(A);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void testSolve1() {
        var sol = new SolutionMeetingRooms();

        int[][] A = {{7,10}, {2,4}};
        var actual = sol.canAttendMeetings(A);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testSolve2() {
        var sol = new SolutionMeetingRooms();

        int[][] A = {{3,4}, {3,5}};
        var actual = sol.canAttendMeetings(A);
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void testSolve3() {
        var sol = new SolutionMeetingRooms();

        int[][] A = {{3,5}, {3,4}};
        var actual = sol.canAttendMeetings(A);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}
