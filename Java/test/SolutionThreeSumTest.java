package test;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import src.SolutionThreeSum;

public class SolutionThreeSumTest {
    @Test
    public void testThreeSum() {
        int[] nums = new int[] { -1, 0, 1, 2, -1, 4 };
        SolutionThreeSum s = new SolutionThreeSum();
        
        List<List<Integer>> actuals = s.threeSum(nums);

        List<List<Integer>> expecteds = new ArrayList<List<Integer>>();
        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(-1);
        item.add(-1);
        item.add(2);
        expecteds.add(item);
        item = new ArrayList<Integer>();
        item.add(-1);
        item.add(0);
        item.add(1);
        expecteds.add(item);

        int i = 0;
        for (List<Integer> list : expecteds) {
            assertArrayEquals(list.toArray(), actuals.get(i).toArray());
            i++;
        }
    }
}
