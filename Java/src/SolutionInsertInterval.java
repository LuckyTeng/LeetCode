package src;

import java.util.LinkedList;
import java.util.List;

public class SolutionInsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> ans = new LinkedList<>();

        int i = 0;
        for (;i < n; i++) {
            if ( intervals[i][1] < newInterval[0] )
                ans.add(intervals[i]);
            else
                break;
        }

        int init = i;
        for (;i < n; i++) {
            if ( newInterval[1] < intervals[i][0] )
                break;
        }

        if ( i != init ) {
            newInterval[0] = Math.min(newInterval[0], intervals[init][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i-1][1]);
        }
        ans.add(newInterval);
        for (;i < n; i++) {
            ans.add(intervals[i]);
        }

        return ans.toArray(new int[0][]);
    }
}
