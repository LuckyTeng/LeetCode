package src;

@LeetCodeInformation(Number = 300, Url = "https://leetcode.com/problems/longest-increasing-subsequence/")
public class SolutionLongestIncreasingSubsequence {
    public int LengthOfLIS(int[] nums) {
        int n = nums.length;

        if ( n <= 1 ) return n;

        int[] tails = new int[n];
        int size = 0;
        

        for (int k = 0; k < n; k++) {
            int x = nums[k];
            int i = 0;
            int j = size;
            while ( i != j ) {
                int m = ( i + j ) / 2;
                if ( tails[m] < x ) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }

            tails[i] = x;
            if ( i == size ) size++;
        }
        return size;
    }
}
