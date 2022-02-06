package src;

// Given n nodes labeled from 0 to n-1 and a list of undirected edges (each edge is a pair of nodes), write a function to check whether these edges make up a valid tree.

// Example 1:

// Input: n = 5, and edges = [[0,1], [0,2], [0,3], [1,4]]
// Output: true

// Example 2:

// Input: n = 5, and edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
// Output: false
// Note: you can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0,1] is the same as [1,0] and thus will not appear together in edges.
@LeetCodeInformation(Number = 261, Url = "https://leetcode.com/problems/graph-valid-tree/")
public class SolutionGraphValidTree {
    private int[] uf;
    public boolean validTree(int n, int[][] edges) {

        uf = new int [n];

        for (int i = 0; i < n; i++) {
            uf[i] = i;
        }

        for (var edge : edges) {
            int p = edge[0];
            int q = edge[1];

            p = find(p);
            q = find(q);

            if ( p == q ) return false;
            uf[p] = q;
        }
        // check we have only one group
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ( uf[i] == i ) count++;
        }
        return count == 1;
    }

    private int find(int i) {
        while ( uf[i] != i ) {
            i = uf[i];
        }

        return i;
    }
}
