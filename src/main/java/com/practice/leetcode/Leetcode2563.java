package com.practice.leetcode;

import java.util.Arrays;

public class Leetcode2563 {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long ans=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            int low=lower-nums[i];
            int high=upper-nums[i];
            ans+=binarySearch(i+1,n-1,high+1,nums)-binarySearch(i+1,n-1,low,nums);
        }
        return ans;
    }

    private int binarySearch(int l, int r, int target,int[] nums) {
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return r;
    }
}
