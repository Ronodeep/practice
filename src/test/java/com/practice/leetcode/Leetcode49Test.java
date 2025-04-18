package com.practice.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode49Test {
    @Test
    public void testGroupAnagrams() {
        Leetcode49 l = new Leetcode49();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(l.groupAnagrams(strs));
    }
}
