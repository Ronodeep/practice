package com.practice.leetcode;

public class Leetcode2962 {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int e:nums){
            max=max>e?max:e; // max ele
        }

        int l=0;
        int count=0;
        int maxFreq=0;

        for(int r=0;r<nums.length;r++){
            if(nums[r]==max){
                maxFreq++;
            }
            while(maxFreq>=k){
                count+=nums.length-r;
                if(nums[l]==max){
                    maxFreq--;
                } 
                l++;
            }
        }
        return count;

    }
}
