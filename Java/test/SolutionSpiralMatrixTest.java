package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import src.SolutionSpiralMatrix;

public class SolutionSpiralMatrixTest {
    @Test
    public void testSpiralOrder() {
        var s = new SolutionSpiralMatrix();

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        var actual = s.spiralOrder(matrix);

        assertNotNull(actual);
        Integer expecteds[] = {1,2,3,6,9,8,7,4,5};
        for (int i = 0; i < expecteds.length; i++) {
            assertEquals(expecteds[i], actual.get(i));
        }
    }
}
