package test;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import src.SolutionPacificAtlanticWaterFlow;

public class SolutionPacificAtlanticWaterFlowTest {
    @Test
    public void testPacificAtlantic() {
        var SolutionNumberofIslands = new SolutionPacificAtlanticWaterFlow();

        int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};

        var actuals = SolutionNumberofIslands.pacificAtlantic(heights);
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(0,4));
        expecteds.add(Arrays.asList(1,3));
        expecteds.add(Arrays.asList(1,4));
        expecteds.add(Arrays.asList(2,2));
        expecteds.add(Arrays.asList(3,0));
        expecteds.add(Arrays.asList(3,1));
        expecteds.add(Arrays.asList(4,0));
        
        for (List<Integer> cell : actuals) {
            if ( !expecteds.contains(cell) )
                fail();
        }
    }

    @Test
    public void testPacificAtlantic1() {
        var SolutionNumberofIslands = new SolutionPacificAtlanticWaterFlow();

        int[][] heights = {{2,1},{1,2}};

        var actuals = SolutionNumberofIslands.pacificAtlantic(heights);
        List<List<Integer>> expecteds = new ArrayList<>();
        expecteds.add(Arrays.asList(0,0));
        expecteds.add(Arrays.asList(0,1));
        expecteds.add(Arrays.asList(1,0));
        expecteds.add(Arrays.asList(1,1));
        
        for (List<Integer> cell : actuals) {
            if ( !expecteds.contains(cell) )
                fail();
        }
    }
}
