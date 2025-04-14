package com.practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode2873Test {
    Leetcode2873 l= new Leetcode2873();
    @Test
    public void testMaximumTripletValue() {
        long res=l.maximumTripletValue(new int[]{1000000,1,1000000});
        Assert.assertEquals(0, res);
    }
}
