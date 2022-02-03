package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@LeetCodeInformation(Number = 207, Url = "https://leetcode.com/problems/course-schedule/")
public class SolutionCourseSchedule {
    final int None = 0;
    final int PMark = 1;
    final int TMark = 2;

    int[] NodeMark;
    Map<Integer, List<Integer>> graph;

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        // build graph
        graph = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++) {
            if ( !graph.containsKey(prerequisites[i][1]) )
                graph.put(prerequisites[i][1], new ArrayList<>());
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        NodeMark = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if ( NodeMark[i] != PMark ) {
                if ( !visit(i) ) return false;
            }
        }

        return true;
    }

    private boolean visit(int i) {
        if ( NodeMark[i] == PMark ) return true;
        if ( NodeMark[i] == TMark ) return false; // cyclic

        NodeMark[i] = TMark;

        // visit all edge
        if ( graph.containsKey(i) ) {
            var edges = graph.get(i);

            for (Integer edge : edges) {
                if ( !visit(edge)) return false;
            }
        }
        NodeMark[i] = PMark;

        return true;
    }
}
