package src;

import java.util.Arrays;

@LeetCodeInformation(Number = 213, Url = "https://leetcode.com/problems/house-robber-ii/")
public class SolutionHouseRobberII {
    int[] dp;
    
    public int rob(int[] nums) {
        int n = nums.length;

        if ( n == 1 ) return nums[0];
        
        dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        var ans1 = maxMoney(Arrays.copyOf(nums, nums.length - 1), 0, n - 1);

        dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        var ans2 = maxMoney(Arrays.copyOfRange(nums, 1, nums.length), 0, n - 1);

        return Math.max(ans1, ans2);
    }
    
    private int maxMoney(int[] nums, int start, int end) {
        int len = end - start;
        if ( len <= 0 ) return 0;
        if ( len == 1 ) {
            dp[start] = nums[start];
            return dp[start];
        }
        
        int val;
        if ( start+2 < end && dp[start+2] != -1 )
            val = dp[start+2];
        else
            val = maxMoney(nums, start + 2, end);
        int sum1 = nums[start] + val;
        
        if ( start+3 < end && dp[start+3] != -1 )
            val = dp[start+3];
        else
            val = maxMoney(nums, start + 3, end);
        int sum2 = nums[start+1] + val;
        
        dp[start] = sum1 > sum2 ? sum1 : sum2;
        return dp[start];
    }
}
