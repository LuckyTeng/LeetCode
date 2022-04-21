package src;

import java.util.ArrayList;
import java.util.List;

@LeetCodeInformation(Number = 515, Url = "https://leetcode.com/problems/find-largest-value-in-each-tree-row/")
public class SolutionFindLargestValueinEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        helper(ans, root, 0);
        
        return ans;       
    }

    private void helper(List<Integer> ans, TreeNode root, int i) {
        if ( root == null ) return;

        // update max value by i
        if ( ans.size() == i ) {
            ans.add(root.val);
        } else {
            ans.set(i, Math.max(root.val, ans.get(i)));
        }

        helper(ans, root.left, i+1);
        helper(ans, root.right, i+1);
    }
}
