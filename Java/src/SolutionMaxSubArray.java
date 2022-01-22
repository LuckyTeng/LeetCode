package src;

@LeetCodeInformation(Number = 53, Url = "https://leetcode.com/problems/maximum-subarray/")
public class SolutionMaxSubArray {
    public int MaxSubArray(int[] nums) {
        if ( nums.length <= 1 ) return nums[0];

        int curr_sum = nums[0];
        int ans = curr_sum; // assign to ans, don't use 0, since curr_sum maybe negative
        for (int i = 1; i < nums.length; i++) {
            if (curr_sum < 0) {
                curr_sum = nums[i];
            } else {
                curr_sum += nums[i];
            }

            if ( curr_sum > ans ) ans = curr_sum;
        }
        return ans;
    }
}
