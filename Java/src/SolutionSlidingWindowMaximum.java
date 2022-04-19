package src;

import java.util.ArrayDeque;
import java.util.Deque;

@LeetCodeInformation(Number = 239, Url = "https://leetcode.com/problems/sliding-window-maximum/")
public class SolutionSlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> de = new ArrayDeque<>();
        int ansIdx = 0;

        for (int i = 0; i < n; i++) {
            // shrink
            while ( !de.isEmpty() && de.size() > k )
                de.removeLast();

            // remove all small than nums[i]
            while ( !de.isEmpty() && nums[de.peek()] < nums[i])
                de.removeLast();

            de.addLast(i);

            if ( i >= k - 1 ) {
                ans[ansIdx++] = nums[de.peek()];
            }
        }
        
        return ans;
    }
}
