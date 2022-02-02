package src;

@LeetCodeInformation(Number = 198, Url = "https://leetcode.com/problems/house-robber/")
public class SolutionHouseRobber {
    int[] dp;
    
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        return maxMoney(nums, 0, n);
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
