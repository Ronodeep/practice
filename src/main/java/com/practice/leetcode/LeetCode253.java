package com.practice.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LeetCode253 {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int[] slot:intervals){
            if(!pq.isEmpty() && pq.peek()<slot[0]){
                pq.poll();
            }
            pq.offer(slot[1]);
        }
        return pq.size();
    }
}
