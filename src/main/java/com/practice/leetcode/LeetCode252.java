package com.practice.leetcode;

import java.util.Arrays;

public class LeetCode252 {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[1], b[1]));
        int[] cur= intervals[0];

        for(int i=1;i<intervals.length;i++){
            if(cur[1]<intervals[i][0]){
                return false;
            }
        }
        return true;
    }
}
