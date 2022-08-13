package src;

// Teng
// Time: O(N)
// Space: O(N)
public class SolutionConvertBinarySearchTreetoSortedDoublyLinkedList {
    TreeNode head = null;
    TreeNode pre = null;

    public TreeNode treeToDoublyList(TreeNode root) {
        dfs(root);
        if ( head == null ) return null;
        head.left = pre;
        pre.right = head;
        return head;
    }

    void dfs(TreeNode root) {
        if ( root == null )
        return;

        dfs(root.left);

        if (head == null) {
            head = root;
        } else {
            pre.right = root;
            root.left = pre;
        }
        pre = root;

        dfs(root.right);
    }
}
