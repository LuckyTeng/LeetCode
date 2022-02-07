package src;

import java.util.LinkedList;

/**   
    Common Helper functions.
    @author teng
 */
final public class CommonHelper {
    public static TreeNode BuildTree(Integer[] tree) {
        TreeNode root = null ;
        if ( tree.length == 0 ) return root;
        if ( tree.length == 1 ) {
            root = new TreeNode(tree[0]);
            return root;
        }

        root = new TreeNode();
        int i = 1;
        int n = tree.length;

        LinkedList<TreeNode> queue = new LinkedList<>();

        root.val = tree[0];
        queue.addFirst(root);

        while ( !queue.isEmpty() ) {
            var node = queue.removeLast();
            
            if ( i >= n ) break;
            if ( tree[i] != null ) {
                node.left = new TreeNode(tree[i]);
                queue.addFirst(node.left);
            }
            i++;
            if ( i >= n ) break;
            if ( tree[i] != null ) {
                node.right = new TreeNode(tree[i]);
                queue.addFirst(node.right);
            }
            i++;
        }

        return root;
    }
}
