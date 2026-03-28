package com.practice.leetcode;

import java.util.Arrays;

public class LeetCode435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[1], b[1]));
        int ans=0;
        int k=Integer.MIN_VALUE;
        for(int[] slot:intervals){
            int st= slot[0];
            int end= slot[1];
            if(st>k){
                k=end;
            }else{
                ans++;
            }
        }
        return ans;
    }
}
