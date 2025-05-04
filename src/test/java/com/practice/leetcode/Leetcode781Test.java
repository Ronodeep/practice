package com.practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode781Test {
    Leetcode781 l= new Leetcode781();
    @Test
    public void testNumRabbits() {
        Assert.assertEquals(5, l.numRabbits(new int[]{1,1,2}));
    }
}
