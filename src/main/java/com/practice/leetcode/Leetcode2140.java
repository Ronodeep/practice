package com.practice.leetcode;

public class Leetcode2140 {
    long[] dp;
    public long mostPoints(int[][] questions) {
        dp= new long[questions.length];
        return dpFunc(0,questions);
    }

    private long dpFunc(int i,int[][] questions) {
        if(i>=questions.length){
            return 0l;
        }
        if(dp[i]>0){
            return dp[i];
        }
        int power=questions[i][1];
        int point=questions[i][0];
        // skip
        long res1=dpFunc(i+1, questions);
        // choose
        long res2=point+dpFunc(i+1+power, questions);
        dp[i]=Math.max(res1, res2);
        return dp[i];
    }
}
