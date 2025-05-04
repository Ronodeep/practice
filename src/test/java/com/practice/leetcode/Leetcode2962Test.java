package com.practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode2962Test {
    Leetcode2962 l= new Leetcode2962();
    @Test
    public void testCountSubarrays() {
        Assert.assertEquals(6, l.countSubarrays(new int[]{1,3,2,3,3}, 2));
    }
}
