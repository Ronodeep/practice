package com.practice.leetcode;

public class LeetCode2918 {
    public long minSum(int[] nums1, int[] nums2) {
        
        Result res1=count(nums1);

        Result res2=count(nums2);

        if((res1.sum<res2.sum && res1.z==0) 
            || (res1.sum>res2.sum && res2.z==0)) {
            return -1;
        }
        return Math.max(res1.sum, res2.sum);
    }
    private Result count(int[] nums){
        int sum=0;
        int z=0;
        for(int e:nums){
            if(e==0){
                sum++;
                z++;
            }else
            sum+=e;
        }
        return new Result(sum, z);
    }
    private class Result{
        int sum=0;
        int z=0;
        public Result(int sum, int z) {
            this.sum = sum;
            this.z = z;
        }
    }
}
