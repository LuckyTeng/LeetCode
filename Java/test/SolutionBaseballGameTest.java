package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionBaseballGame;

public class SolutionBaseballGameTest {
    @Test
    public void testCalPoints() {
        var sol = new SolutionBaseballGame();

        String[] ops = {"5", "2", "C", "D", "+"};
        var actual = sol.calPoints(ops);
        int expected = 30;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalPoints1() {
        var sol = new SolutionBaseballGame();

        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+" };
        var actual = sol.calPoints(ops);
        int expected = 27;

        assertEquals(expected, actual);
    }

    @Test
    public void testCalPoints2() {
        var sol = new SolutionBaseballGame();

        String[] ops = { "1" };
        var actual = sol.calPoints(ops);
        int expected = 1;

        assertEquals(expected, actual);
    }
}
