package src;

@LeetCodeInformation(Number = 121, Url = "https://leetcode.com/problems/best-time-to-buy-and-sell-stock/")
public class SolutionBestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if ( prices.length <= 1 ) return 0;

        int min = prices[0];
        int ans = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - min;

            if ( profit > ans ) {
                ans = profit;
            }

            if ( prices[i] < min ) min = prices[i];
        }
        return ans;
    }
}
