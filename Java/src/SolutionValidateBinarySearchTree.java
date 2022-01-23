package src;

@LeetCodeInformation(Number = 98, Url = "https://leetcode.com/problems/validate-binary-search-tree/")
public class SolutionValidateBinarySearchTree {
    public class TreeNode {
            int val;
            public TreeNode left;
            public TreeNode right;
            public TreeNode() {}
            public TreeNode(int val) { this.val = val; }
            public TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer lower, Integer upper) {
        if ( root == null ) return true;

        if ( lower != null && root.val <= lower ) return false;
        if ( upper != null && root.val >= upper ) return false;

        return helper(root.left, lower, root.val) &&
               helper(root.right, root.val, upper);
    }
}
