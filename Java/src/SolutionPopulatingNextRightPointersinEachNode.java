package src;

@LeetCodeInformation(Number = 116, Url = "https://leetcode.com/problems/populating-next-right-pointers-in-each-node/")
public class SolutionPopulatingNextRightPointersinEachNode {
    public TreeLinkNode connect(TreeLinkNode root) {
        if ( root == null ) return null;

        TreeLinkNode prev = root;
        TreeLinkNode curr = null;

        while (prev.left !=null) {
            curr = prev;
            while ( curr != null ) {
                curr.left.next = curr.right;
                if ( curr.next != null ) curr.right.next = curr.next.left;
                curr = curr.next;
            }
            prev = prev.left;
        }
        return root;
    }
}
