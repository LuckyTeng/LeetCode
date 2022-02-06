package src;

import java.util.Arrays;

// Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
@LeetCodeInformation(Number = 252, Url = "https://leetcode.com/problems/meeting-rooms/")
public class SolutionMeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        if ( intervals.length <= 1 ) return true;

        Arrays.sort(intervals, (a,b)-> a[0] - b[0]);

        for (int i = 1; i < intervals.length; i++) {
            if ( intervals[i][0] - intervals[i-1][1] < 0 )
                return false;
        }
        return true;
    }
}
