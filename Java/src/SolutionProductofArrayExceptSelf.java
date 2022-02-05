package src;

@LeetCodeInformation(Number = 238, Url = "https://leetcode.com/problems/product-of-array-except-self/")
public class SolutionProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] L = new int[n];
        L[0] = 1;
        for (int i = 1; i < n; i++) {
            L[i] = L[i-1] * nums[i-1];
        }

        int R = 1;
        for (int i = n - 1; i >= 0; i--) {
            L[i] = R * L[i];
            R = R * nums[i];
        }
        return L;
    }
}
