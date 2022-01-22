package src;

import java.util.Arrays;
import java.util.LinkedList;

public class SolutionMergeIntervals {
    public int[][] merge(int[][] intervals) {    
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> ans = new LinkedList<int[]>();
        
        for (int i = 0; i < intervals.length; i++) {
            if ( ans.isEmpty() || ans.getLast()[1] < intervals[i][0]) // first or non-overlap
                ans.add(intervals[i]);
            else {
                ans.getLast()[1] = Math.max(ans.getLast()[1], intervals[i][1]); // extend right boundary
            }
        }
    
        return ans.toArray(new int[0][]); // using type to convert to array
    }

}
