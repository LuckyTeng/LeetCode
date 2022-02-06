package src;

import java.util.Arrays;

// Question
// Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

// For example, Given [[0, 30],[5, 10],[15, 20]], return 2.
@LeetCodeInformation(Number = 253, Url = "https://leetcode.com/problems/meeting-rooms-ii/")
public class SolutionMeetingRoomsII {
    public int solve(int[][] A) {
        int ans = 0, room = 0;
        int n = A.length;

        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = A[i][0];
            end[i] = A[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);
        
        int i = 0, j = 0;

        while ( i < n && j < n ) {
            if ( start[i] < end[j] ) {
                room++;
                i++;
            } else {
                room--;
                j++;
            }
            ans = Math.max(ans, room);
        }
        return ans;
    }
}
