package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionRotateImage;

public class SolutionRotateImageTest {
    @Test
    public void testRotate() {
        SolutionRotateImage s = new SolutionRotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        s.rotate(matrix);

        int[][] expected = {{7,4,1}, {8,5,2}, {9,6,3}};

        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], matrix[i][j]);
            }
        }
    }
}
