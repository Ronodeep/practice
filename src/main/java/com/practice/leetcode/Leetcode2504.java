package com.practice.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.PriorityQueue;

public class Leetcode2504 {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int n=queries.length;
        int[] res= new int[queries.length];
        int row=grid.length;
        int col=grid[0].length;
        int[][] q= new int[n][2];
        for(int i=0;i<n;i++){
            q[i][0]=queries[i];
            q[i][1]=i;
        }
        Arrays.sort(q,Comparator.comparingInt(a -> a[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int points=0;
        Set<String> visited= new HashSet<>();
        visited.add("0_0");
        pq.offer(new int[]{grid[0][0],0,0});
        for(int[] a:q){
            while(!pq.isEmpty() && pq.peek()[0]<a[0]){
                int[] temp=pq.poll();
                points++;
                int curRow=temp[1];
                int curCol=temp[2];
                int[][] neigh= new int[][]{{-1,0}, {1,0}, {0,-1}, {0,1}};
                for(int i=0;i<4;i++){
                    int newRow=curRow+neigh[i][0] ;
                    int newCol=curCol+neigh[i][1];
                    if(newRow >= 0 && newRow<row
                        && newCol >=0 && newCol<col
                        && !visited.contains(newRow+"_"+newCol)
                    ){
                        visited.add(newRow+"_"+newCol);
                        pq.offer(new int[]{
                            grid[newRow][newCol],
                            newRow,
                            newCol
                        });
                    }
                }
            }
            res[a[1]]=points;
        }
        return res;
    }
}
