package src;

@LeetCodeInformation(Number = 235, Url = "https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/")
public class SolutionLowestCommonAncestorofaBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ( true ) {
            if ( p == root || q == root ) return root;
            if (( p.val < root.val && q.val > root.val ) ||
                ( p.val > root.val && q.val < root.val ) ) {
                // not same side
                return root;
            }
            if ( p.val < root.val && q.val < root.val ) {
                // same left
                root = root.left;
            }
            if ( p.val > root.val && q.val > root.val ) {
                root = root.right;
            }
        }
    }
}
