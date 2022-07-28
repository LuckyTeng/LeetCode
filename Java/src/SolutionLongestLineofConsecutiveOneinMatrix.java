package src;

public class SolutionLongestLineofConsecutiveOneinMatrix {
    public int longestLine(int[][] m) {
        // Write your code here
        int rows = m.length;
        int cols = m[0].length;

        int[][] dp = new int[rows*cols][3];

        int ans = 0;

        for ( int j = 0; j < rows; j++ ) {
            for ( int i = 0; i < cols; i++ ) {
                if ( m[j][i] == 1 ) {
                    dp[j*cols+i][0] = dp[j*cols+i][1] = dp[j*cols+i][2] = 1;
                    ans = Math.max(ans, 1);
                    if ( j > 0 && i > 0 ) {
                        dp[j*cols+i][2] = dp[j*cols+i][2] + dp[(j-1)*cols + (i-1)][2];
                        ans = Math.max(ans, dp[j*cols+i][2]);
                    }

                    if ( i > 0 ) {
                        dp[j*cols+i][1] = dp[j*cols+i][1] + dp[j*cols+(i-1)][1];
                        ans = Math.max(ans, dp[j*cols+i][1]);
                    }

                    if ( j > 0 ) {
                        dp[j*cols+i][0] = dp[j*cols+i][0] + dp[(j-1)*cols+i][0];
                        ans = Math.max(ans, dp[j*cols+i][0]);
                    }
                }
            }
        }
        return ans;
    }
}
