package src;

@LeetCodeInformation(Number = 152, Url = "https://leetcode.com/problems/maximum-product-subarray/")
public class SolutionMaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;

        Integer positive = null;
        Integer negtive = null;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            if ( value > 0 ) {
                if ( positive != null )
                    positive = positive * value;
                else
                    positive = value;

                if ( negtive != null )
                    negtive = negtive * value;
            } else if ( value < 0 ) {
                Integer temp = negtive;

                if ( positive != null )
                    negtive = positive * value;
                else
                    negtive = value;

                if ( temp != null )
                    positive = temp * value;
                else
                    positive = null;
            } else {
                positive = null;
                negtive = null;
                ans = Math.max(ans, 0);
            }

            if ( positive != null )
                ans = Math.max(ans, positive);
            if ( negtive != null )
                ans = Math.max(ans, negtive);
        }

        return ans;
    }
}
