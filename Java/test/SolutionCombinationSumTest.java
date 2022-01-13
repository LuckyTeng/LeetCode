package test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import src.SolutionCombinationSum;

public class SolutionCombinationSumTest {
    @Test
    public void testCombinationSum() {
        SolutionCombinationSum s = new SolutionCombinationSum();

        int[] candidates = new int[] { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> actual = s.combinationSum(candidates, target);

        Integer[][] expecteds = new Integer[][] { {2,2,3}, {7}};
        assertEquals(2, actual.size());
        for (int i = 0; i < expecteds.length; i++) {
            for (int j = 0; j < expecteds[i].length; j++) {
                assertEquals(expecteds[i][j], actual.get(i).get(j)); 
            }
        }
    }
}
