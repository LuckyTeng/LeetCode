package src;

import java.util.HashSet;
import java.util.Set;

@LeetCodeInformation(Number = 217, Url = "https://leetcode.com/problems/contains-duplicate/")
public class SolutionContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        final Set<Integer> set = new HashSet<>();
        
        for ( int i = 0; i < nums.length; i++ ) {
            if (set.contains(nums[i]))
                return true;
            
            set.add(nums[i]);
        }
        
        return false;
    }
}
