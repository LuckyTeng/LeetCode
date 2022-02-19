package src;

import java.util.HashMap;
import java.util.Map;

@LeetCodeInformation(Number = 1, Url = "https://leetcode.com/problems/two-sum/")
public class SolutionTwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];

            if ( hash.containsKey(comp) ) {
                return new int[] { i, hash.get(comp)};
            }
            hash.put(nums[i], i ); // add later, cuz self can't be self
        }    

        return new int[]{};
    }
}