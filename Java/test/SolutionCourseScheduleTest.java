package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionCourseSchedule;

public class SolutionCourseScheduleTest {
    @Test
    public void testCanFinish() {
        var sol = new SolutionCourseSchedule();

        int numCourses = 2;
        int[][] prerequisites = {{1,0}};

        var actual = sol.canFinish(numCourses, prerequisites);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testCanFinish1() {
        var sol = new SolutionCourseSchedule();

        int numCourses = 2;
        int[][] prerequisites = {{1,0}, {0,1}};

        var actual = sol.canFinish(numCourses, prerequisites);
        boolean expected = false;

        assertEquals(expected, actual);
    }
}
