package src;

@LeetCodeInformation(Number = 70, Url = "https://leetcode.com/problems/climbing-stairs/")
public class SolutionClimbingStairs {
    public int climbStairs(int n) {
        if ( n <= 3 ) return n;

        int[] dp = new int[n+1];
        for (int i = 1; i <= 3; i++) {
            dp[i] = i;
        }

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
