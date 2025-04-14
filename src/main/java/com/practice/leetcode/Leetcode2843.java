package com.practice.leetcode;
public class Leetcode2843 {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String str=String.valueOf(i);
            int len=str.length();
            if(len%2==1){
                continue; 
            }else{
                int left=0;
                int right=0;
                for(int j=0,k=0;j<len/2;j++,k++){
                    left+=(str.charAt(j)-'0');
                    right+=(str.charAt(len/2+k)-'0');
                }
                if(left==right){
                    count++;
                }
            }

        }
        return count;
    }
}