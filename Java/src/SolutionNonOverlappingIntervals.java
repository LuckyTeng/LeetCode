package src;

import java.util.Arrays;

@LeetCodeInformation(Number = 435, Url = "https://leetcode.com/problems/non-overlapping-intervals/")
public class SolutionNonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);

        int n = intervals.length;

        if ( n <= 1 ) return 0;
        int count = 1;
        int end = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if ( intervals[i][0] >= end ) {
                end = intervals[i][1];
                count++;
            }
        }
        return n - count;
    }
}
