package src;

/**
 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes), write a function to find the number of connected components in an undirected graph.
 */
@LeetCodeInformation(Number = 323, Url = "https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/")
public class SolutionNumberofConnectedComponentsinanUndirectedGraph {
    private int[] uf;

    public int countComponents(int n, int[][] edges) {
        uf = new int [n];

        for (int i = 0; i < n; i++) {
            uf[i] = i;
        }

        for (var edge : edges) {
            int p = edge[0];
            int q = edge[1];

            p = find(p);
            q = find(q);

            uf[p] = q;
        }
        // check we have only one group
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ( uf[i] == i ) count++;
        }
        return count;
    }    

    private int find(int i) {
        while ( uf[i] != i ) {
            i = uf[i];
        }

        return i;
    }
}
