package src;

@LeetCodeInformation(Number = 33, Url = "https://leetcode.com/problems/search-in-rotated-sorted-array/")
public class SolutionSearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length;

        while ( lo < hi )
        {
            int mid = (lo + hi) / 2;
            int num = target < nums[0] == nums[mid] < nums[0] ?
                      nums[mid] : nums[mid] < nums[0] ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            if ( target < num ) {
                hi = mid;
            } else if ( target > num ) {
                lo = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
