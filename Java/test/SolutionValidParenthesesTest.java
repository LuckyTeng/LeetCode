package test;

import static org.junit.Assert.assertEquals;

import java.nio.file.FileSystemAlreadyExistsException;

import org.junit.Test;

import src.SolutionValidParentheses;

public class SolutionValidParenthesesTest {
    @Test
    public void testIsValid() {
        SolutionValidParentheses s = new SolutionValidParentheses();
        
        String input = "()[]{}";

        var actual = s.IsValid(input);

        assertEquals(true, actual);
    }

    @Test
    public void testIsValid2() {
        SolutionValidParentheses s = new SolutionValidParentheses();
        
        String input = "(]";

        var actual = s.IsValid(input);

        assertEquals(false, actual);
    }

    @Test
    public void testIsValid3() {
        SolutionValidParentheses s = new SolutionValidParentheses();
        
        String input = "((([])))";

        var actual = s.IsValid(input);

        assertEquals(true, actual);
    }

    @Test
    public void testIsValid4() {
        SolutionValidParentheses s = new SolutionValidParentheses();
        
        String input = "(])";

        var actual = s.IsValid(input);

        assertEquals(false, actual);
    }
}
