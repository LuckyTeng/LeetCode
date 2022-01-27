package src;

import java.util.HashSet;
import java.util.Set;

@LeetCodeInformation(Number = 128, Url = "https://leetcode.com/problems/longest-consecutive-sequence/")
public class SolutionLongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if ( n <= 1 ) return n;
        int ans = 0;

        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            numSet.add(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            int num = nums[i];

            if ( !numSet.contains(num - 1) ) {
                int streak = 1;
                while ( numSet.contains(num + 1) ) {
                    num++;
                    streak++;
                }
                if ( streak > ans )
                    ans = streak;
            }
        }
        
        return ans;
    }
}
