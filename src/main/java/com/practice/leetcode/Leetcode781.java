package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode781 {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map= new HashMap<>();
        int numRabbits=0;

        for(int e:answers){
            if(e==0){
                numRabbits++;
            }
            else if(map.containsKey(e)){
                map.put(e, map.get(e)+1);
                if(e+1==map.get(e)){
                    numRabbits+=e+1;
                    map.remove(e);
                }
            }else{
                map.put(e, 1);
            }
        }
        for(int key: map.keySet()){
            numRabbits+=key+1;
        }
        return numRabbits;
    }
}
