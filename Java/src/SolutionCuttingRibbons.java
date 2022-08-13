package src;

import java.util.Arrays;

// 1891. Cutting Ribbons

// You are given an integer array ribbons, where ribbons[i] represents the length of the ith ribbon, and an integer k.
// You may cut any of the ribbons into any number of segments of positive integer lengths, or perform no cuts at all.
// Return the maximum possible positive integer length that you can obtain k ribbons of, or 0 if you cannot obtain k ribbons of the same length.

// Teng
// Time : O(Nlogn)
// Space : O(1)
public class SolutionCuttingRibbons {
    public int maxLength(int[] ribbons, int k) {
        int l = 1;
        int r = (int) (Arrays.stream(ribbons).asLongStream().sum() / k) + 1;
    
        while (l < r) {
          final int m = (l + r) / 2;
          if (!isCutPossible(ribbons, m, k))
            r = m;
          else
            l = m + 1;
        }
    
        return l - 1;
      }
    
      private boolean isCutPossible(int[] ribbons, int length, int k) {
        int count = 0;
        for (var ribbon : ribbons)
          count += ribbon / length;
        return count >= k;
      }
}
