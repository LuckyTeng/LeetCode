package src;

import java.util.Arrays;

@LeetCodeInformation(Number = 322, Url = "https://leetcode.com/problems/coin-change/")
public class SolutionCoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                int coin = coins[j];

                if ( coin <= i ){
                    dp[i] = Math.min(dp[i], dp[i-coin] + 1);
                } 
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
