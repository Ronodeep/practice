package com.practice.leetcode;

public class LeetCode1922 {
    private static final  long MOD=1_000_000_007;
    public int countGoodNumbers(long n) {
        long even= (long) Math.ceil(n / 2.0);
        long odd = n/ 2;
        return (int) ((myPow(5,even) * myPow(4,odd)) % MOD);
    }
    private long myPow(long n, long p) {
        long res=1;

        while(p>0){
            if(p%2==1){
                res=(res*n)%MOD;
            }
            p=p/2;
            n=(n*n)%MOD;

        }
        return (res);

    }
    
}
