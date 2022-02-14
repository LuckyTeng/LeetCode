package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@LeetCodeInformation(Number = 417, Url = "https://leetcode.com/problems/pacific-atlantic-water-flow/")
public class SolutionPacificAtlanticWaterFlow {
    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();

        int m = heights.length;
        int n = heights[0].length;

        if ( heights == null || m == 0 || n == 0 ) return ans;
        
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        Queue<int[]> pQueue = new LinkedList<>();
        Queue<int[]> aQueue = new LinkedList<>();

        // hori
        for (int i = 0; i < n; i++) {
            pQueue.offer(new int[]{0,i});
            aQueue.offer(new int[]{m-1,i});
            pacific[0][i] = true;
            atlantic[m-1][i] = true;
        }

        for (int j = 0; j < m; j++) {
            pQueue.offer(new int[]{j,0});
            aQueue.offer(new int[]{j,n-1});
            pacific[j][0] = true;
            atlantic[j][n-1] = true;
        }

        bfs(heights, pacific, pQueue);
        bfs(heights, atlantic, aQueue);

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if ( pacific[j][i] && atlantic[j][i] ) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(j);
                    cell.add(i);
                    ans.add(cell);
                }
            }
        }
        
        return ans;
    }

    private void bfs(int[][] heights, boolean[][] visited, Queue<int[]> queue) {
        int m = heights.length;
        int n = heights[0].length;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (var d : dir) {
                int x = curr[0] + d[0];
                int y = curr[1] + d[1];

                if ( x < 0 || y < 0 || x >= m || y >= n || visited[x][y] || heights[curr[0]][curr[1]] > heights[x][y] )
                    continue;

                visited[x][y] = true;
                queue.offer(new int[]{x,y});
            }
        }
    }

    public List<List<Integer>> pacificAtlanticBfs(int[][] heights) {
        List<List<Integer>> ans = new ArrayList<>();

        int m = heights.length;
        int n = heights[0].length;

        if ( heights == null || m == 0 || n == 0 ) return ans;
        
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // hori
        for (int i = 0; i < n; i++) {
            dfs(heights, pacific, Integer.MIN_VALUE, 0, i);
            dfs(heights, atlantic, Integer.MIN_VALUE, m-1, i);
        }

        for (int j = 0; j < m; j++) {
            dfs(heights, pacific, Integer.MIN_VALUE, j, 0);
            dfs(heights, atlantic, Integer.MIN_VALUE, j, n-1);
        }

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if ( pacific[j][i] && atlantic[j][i] ) {
                    ans.add(Arrays.asList(j,i));
                }
            }
        }
        
        return ans;
    }

    private void dfs(int[][] heights, boolean[][] visited, int height, int x, int y) {
        int m = heights.length;
        int n = heights[0].length;

        if ( x < 0 || y < 0 || x >= m || y >= n || visited[x][y] || heights[x][y] < height )
            return;

        visited[x][y] = true;

        for (var d : dir) {
            dfs(heights, visited, heights[x][y], x+d[0], y+d[1]);
        }
    }
}
