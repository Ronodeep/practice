package com.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode2799 {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        Set<Integer> set= new HashSet<>();
        for(int e:nums){
            set.add(e);
        }
        int res=0;
        int l=0;
        int r=0;
        Set<Integer> temp= new HashSet<>();
        while(l<n){
            if(r<n && set.contains(nums[r])){
                temp.add(nums[r]);
                r++;
            }
            if(temp.size()==set.size()){
                res+=(n-r+1);
                temp.remove(nums[l]);
                l++;
            }
        }
        return res;
    }
}
