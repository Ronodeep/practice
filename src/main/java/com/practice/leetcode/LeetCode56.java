package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] cur= intervals[0];
        List<int[]> res= new ArrayList<>();
        res.add(cur);
        for(int i=1;i<intervals.length;i++){
            if(cur[1] > intervals[i][0]){ // merge
                cur[1]=Math.max(cur[1], intervals[i][1]);
                
            }else{
                cur=intervals[i];
                res.add(cur);
            }
        }
        
        return res.toArray(new int[res.size()][]);

    }
}
