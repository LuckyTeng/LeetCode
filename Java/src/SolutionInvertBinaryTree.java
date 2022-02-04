package src;

@LeetCodeInformation(Number = 226, Url = "https://leetcode.com/problems/invert-binary-tree/")
public class SolutionInvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if ( root == null ) return null;

        invertTreeRecurr(root);
        return root;
    }

    private void invertTreeRecurr(TreeNode root) {
        if ( root == null ) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTreeRecurr(root.left);
        invertTreeRecurr(root.right);
    }
}
