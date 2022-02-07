package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.SolutionNumberofConnectedComponentsinanUndirectedGraph;

public class SolutionNumberofConnectedComponentsinanUndirectedGraphTest {
    @Test
    public void testCountComponents() {
        var sol = new SolutionNumberofConnectedComponentsinanUndirectedGraph();

        int n = 5;
        int[][] edges = {{0,1},{1,2},{3,4}};

        var actual = sol.countComponents(n, edges);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void testCountComponents1() {
        var sol = new SolutionNumberofConnectedComponentsinanUndirectedGraph();

        int n = 5;
        int[][] edges = {{0,1},{1,2},{2,3},{3,4}};

        var actual = sol.countComponents(n, edges);
        int expected = 1;

        assertEquals(expected, actual);
    }
}
