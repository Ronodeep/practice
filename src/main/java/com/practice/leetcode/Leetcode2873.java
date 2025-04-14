package com.practice.leetcode;

public class Leetcode2873 {
    public long maximumTripletValue(int[] nums) {
        long res=0l;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    long temp=(nums[i]-nums[j])*nums[k];
                    res=Math.max(res,temp);
                }
            }
        }
        return res;
    }
}
