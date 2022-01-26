package src;

@LeetCodeInformation(Number = 124, Url = "https://leetcode.com/problems/binary-tree-maximum-path-sum/")
public class SolutionBinaryTreeMaximumPathSum {
    int ans;
    public int maxPathSum(TreeNode root) {
        ans = Integer.MIN_VALUE;

        if ( root == null ) return 0;

        MaxPathSumTraverse(root);

        return ans;
    }

    private void MaxPathSumTraverse(TreeNode root) {
        if ( root.left != null ) MaxPathSumTraverse(root.left);
        if ( root.right != null ) MaxPathSumTraverse(root.right);

        int lval = root.left != null ? root.left.val : 0;
        int rval = root.right != null ? root.right.val : 0;
        int val = root.val;

        ans = Math.max(ans, lval + val);
        ans = Math.max(ans, rval + val);
        ans = Math.max(ans, lval + val + rval);
        ans = Math.max(ans, val);

        if ( lval > 0 || rval > 0 ) {
            root.val = Math.max(lval + val, rval + val);
        }
    }
}
