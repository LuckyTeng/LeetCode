package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionGraphValidTree;

public class SolutionGraphValidTreeTest {
    @Test
    public void testValidTree() {
        var sol = new SolutionGraphValidTree();

        int n = 5 ;
        int[][] edges = {{0,1},{0,2},{0,3},{1,4}};
        var actual = sol.validTree(n, edges);

        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void testValidTree1() {
        var sol = new SolutionGraphValidTree();

        int n = 5 ;
        int[][] edges = {{0,1},{1,2},{2,3},{1,3},{1,4}};
        var actual = sol.validTree(n, edges);

        boolean expected = false;

        assertEquals(expected, actual);
    }
}
