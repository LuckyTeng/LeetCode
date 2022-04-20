package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.CommonHelper;
import src.SolutionPopulatingNextRightPointersinEachNode;
import src.TreeLinkNode;

public class SolutionPopulatingNextRightPointersinEachNodeTest {
    @Test
    public void testConnect() {
        var sol = new SolutionPopulatingNextRightPointersinEachNode();

        var actual = sol.connect(null);
        TreeLinkNode expected = null;
        
        assertEquals(expected, actual);
    }

    @Test
    public void testConnect1() {
        var sol = new SolutionPopulatingNextRightPointersinEachNode();

        var root = CommonHelper.BuildTreeLinkNode(new Integer[]{1,2,3,4,5,6,7});
        var actual = sol.connect(root);
        
        assertEquals(null, actual.next);
        assertEquals(3, actual.left.next.val);
    }
}
