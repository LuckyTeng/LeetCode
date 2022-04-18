package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionEvaluateReversePolishNotation;

public class SolutionEvaluateReversePolishNotationTest {
    @Test
    public void testEvalRPN() {
        var sol = new SolutionEvaluateReversePolishNotation();

        String[] tokens = {"2", "1", "+", "3", "*"};
        var actual = sol.evalRPN(tokens);

        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void testEvalRPN1() {
        var sol = new SolutionEvaluateReversePolishNotation();

        String[] tokens = {"4", "13", "5", "/", "+"};
        var actual = sol.evalRPN(tokens);

        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void testEvalRPN2() {
        var sol = new SolutionEvaluateReversePolishNotation();

        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        var actual = sol.evalRPN(tokens);

        int expected = 22;

        assertEquals(expected, actual);
    }
}
