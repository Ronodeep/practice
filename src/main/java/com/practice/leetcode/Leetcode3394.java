package com.practice.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode3394 {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int len=rectangles.length;
        int[][] x=new int[len][2];
        int[][] y=new int[len][2];

        for(int i=0;i<len;i++){
            x[i][0]=rectangles[i][0];
            x[i][1]=rectangles[i][2];

            y[i][0]=rectangles[i][1];
            y[i][1]=rectangles[i][3];
        }
        Arrays.sort(x, Comparator.comparingInt(a->a[0]));
        Arrays.sort(y, Comparator.comparingInt(a->a[0]));
        
        return Math.max(checkValidCutsHelper(x), checkValidCutsHelper(y))>=3;
    }
    private int checkValidCutsHelper(int[][] t){
        int count=0;
        int last_end=-1;
        for(int[] a:t){
            if(last_end <= a[0]){
                count++;
            }
            last_end=Math.max(last_end, a[1]);
        }
        return count;
    }
}
