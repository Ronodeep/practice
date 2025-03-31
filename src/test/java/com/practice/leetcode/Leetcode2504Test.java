package com.practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode2504Test {
    Leetcode2504 l= new Leetcode2504();
    @Test
    public void testMaxPoints() {
        int[] res=l.maxPoints(new int[][]{{1,2,3},{2,5,7},{3,5,1}}, new int[]{5,6,2});
        Assert.assertArrayEquals(res, new int[]{5,8,1});
    }
}
