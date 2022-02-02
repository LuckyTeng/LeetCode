package src;

@LeetCodeInformation(Number = 200, Url = "https://leetcode.com/problems/number-of-islands/")
public class SolutionNumberofIslands {
    int m;
    int n;
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ( grid[j][i] == '1' ) {
                    ans++;
                    sinkIsland(i, j, grid);
                }
            }
        }
        return ans;
    }

    private void sinkIsland(int i, int j, char[][] grid){
        if ( i > 0 && grid[j][i-1] == '1' ){
            grid[j][i-1] = '0';
            sinkIsland(i-1, j, grid);
        }

        if ( j > 0 && grid[j-1][i] == '1' ) {
            grid[j-1][i] = '0';
            sinkIsland(i, j-1, grid);
        }

        if ( i + 1 < n && grid[j][i+1] == '1' ) {
            grid[j][i+1] = '0';
            sinkIsland(i+1, j, grid);
        }

        if ( j + 1 < m && grid[j+1][i] == '1' ) {
            grid[j+1][i] = '0';
            sinkIsland(i, j+1, grid);
        }
    }
}
