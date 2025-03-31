package com.practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode3394Test {
    @Test
    public void testCheckValidCuts() {
        Leetcode3394 l= new Leetcode3394();
        int[][] rectangles= new int[][]{{1,0,5,2},{0,2,2,4},{3,2,5,3},{0,4,4,5}};
        Assert.assertTrue(l.checkValidCuts(5,rectangles)); ;
    }
}
