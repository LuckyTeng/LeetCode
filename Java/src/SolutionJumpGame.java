package src;

public class SolutionJumpGame {
    public boolean CanJump(int[] nums) {
        int n = nums.length;
        int last = n - 1;
        
        // greedy
        for ( int i = n - 2; i >= 0; i-- ) {
            if ( i + nums[i] >= last ) last = i;
        }
        
        return last <= 0;
        // if ( nums.length == 1 && nums[0] == 0 ) return true;

        // int[] dp = new int[nums.length]; // uncheck = 0, 1 = false, 2 = true

        // CanJump(nums, 0, dp);

        // return dp[0] == 2;
    }

    // private void CanJump(int[] nums, int start, int[] dp) {
    //     if ( dp[start] != 0 ) return;

    //     int n = nums[start];      
    //     for (int i = 0; i <= n; i++) {
    //         if ( start + i == nums.length - 1 ) {
    //             dp[start] = 2;
    //             return;
    //         } else if ( i != 0 && start + i < nums.length - 1 ) {
    //             CanJump(nums, start + i, dp);
    //             if ( dp[start + i] == 2) {
    //                 dp[start] = 2;
    //                 return;
    //             }
    //         }
    //     }
    //     dp[start] = 1;
    // }
}


