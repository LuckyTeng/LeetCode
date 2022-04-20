package src;

@LeetCodeInformation(Number = 117, Url = "https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/")
public class SolutionPopulatingNextRightPointersinEachNodeII {

    public TreeLinkNode connect(TreeLinkNode root) {
        TreeLinkNode head = null;
        TreeLinkNode prev = null;
        TreeLinkNode curr = root;

        while ( curr != null ) {
            while ( curr != null ) {
                if ( curr.left != null ) {
                    if ( prev == null ) {
                        head = curr.left;
                    } else {
                        prev.next = curr.left;
                    }
                    prev = curr.left;
                }

                if ( curr.right != null ) {
                    if ( prev == null ) {
                        head = curr.right;
                    } else {
                        prev.next = curr.right;
                    }
                    prev = curr.right;
                }

                curr = curr.next; // next neighbor
            }

            curr = head; // next level
            head = null;
            prev = null;
        }

        return root;
    }
}
