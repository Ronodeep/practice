package com.practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode2563Test {
    Leetcode2563 l= new Leetcode2563();
    @Test
    public void testCountFairPairs() {
        int[] arr= new int[]{0,1,7,4,4,5};
        Assert.assertEquals(6, l.countFairPairs(arr, 0, 0));
    }
}
