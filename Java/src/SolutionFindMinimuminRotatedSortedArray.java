package src;

@LeetCodeInformation(Number = 153, Url = "https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/")
public class SolutionFindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        int n = nums.length;
        if ( n == 1 ) return nums[0];

        int left = 0, right = n - 1;
        int mid = (left + right) / 2;

        if ( nums[right] > nums[0] )
            return nums[0];

        while (true) {
            if ( nums[mid] > nums[mid+1] )
                return nums[mid+1];
            else if ( nums[mid-1] > nums[mid] )
                return nums[mid];

            if ( nums[mid] > nums[0] )
                left = mid + 1;
            else
                right = mid - 1;
            
            mid = (left + right) / 2;
        }
    }
}
