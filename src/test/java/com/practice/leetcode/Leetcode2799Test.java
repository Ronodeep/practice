package com.practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode2799Test {
    private Leetcode2799 l= new Leetcode2799();
    @Test
    public void testCountCompleteSubarrays() {
        Assert.assertEquals(4, l.countCompleteSubarrays(new int[]{1,3,1,2,2}));
    }
}
