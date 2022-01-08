package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        var ans = new ArrayList<List<Integer>>();

        int n = nums.length;

        if ( n < 3 ) return ans;

        Arrays.sort(nums);

        for ( int i = 0; i < n - 2; i++ ){
            int left = i + 1;
            int right = n - 1;
           
            int num = nums[i];
            while ( left < right ){
                int total = num + nums[left] + nums[right];
                if ( total > 0 ) {
                    right--;
                } else if ( total < 0 ) {
                    left++;
                } else {
                    List<Integer> item = new ArrayList<Integer>();
                    item.add(num);
                    item.add(nums[left]);
                    item.add(nums[right]);
                    ans.add(item);

                    while ( nums[right] == nums[right-1] && left < right ) right--;
                    while ( nums[left] == nums[left+1] && left < right ) left++;
                    left++;
                    right--;
                }
            }

            while ( nums[i] == nums[i+1] && i < n - 2 ) i++;
        }

        return ans;
    }
}
