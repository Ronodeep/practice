package com.practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode2843Test {
    Leetcode2843 l= new Leetcode2843();
    @Test
    public void testCountSymmetricIntegers() {
        Assert.assertEquals(9, l.countSymmetricIntegers(1, 100));
    }
}
