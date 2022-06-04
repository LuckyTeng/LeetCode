package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.CommonHelper;
import src.SolutionMenuChange;
import src.TreeNode;

public class SolutionMenuChangeTest {
    @Test
    public void testMenuChange() {
        var sol = new SolutionMenuChange();

        TreeNode a = CommonHelper.BuildTree(new Integer[]{1,2,3,4,5,null,6});
        TreeNode b = CommonHelper.BuildTree(new Integer[]{1,2,3,4,5,null,6,null,null,null,null,null,7});

        var actual = sol.MenuChange(a, b);
        int expected = 2;

        assertEquals(expected, actual);
    }
}
