package src;

import java.util.Arrays;

// Given an 2D integer array A of size N x 2 denoting time intervals of different meetings.

// Where:

// A[i][0] = start time of the ith meeting.
// A[i][1] = end time of the ith meeting.
// Find the minimum number of conference rooms required so that all meetings can be done.
@LeetCodeInformation(Number = -1, Url = "https://www.interviewbit.com/problems/meeting-rooms/")
public class SolutionMeetingRooms {
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
