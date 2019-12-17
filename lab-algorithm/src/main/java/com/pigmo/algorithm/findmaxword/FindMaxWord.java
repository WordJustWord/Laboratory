package com.pigmo.algorithm.findmaxword;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class FindMaxWord {

    private String resource;

    @Getter
    private char target;

    @Getter
    private Integer max = 0;

    public FindMaxWord(String res) {
        this.resource = res;
    }

    public void doFind() {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < resource.length(); i++) {
            char c = resource.charAt(i);
            Integer count = map.get(c);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(c, count);
            if (count > max) {
                target = c;
                max = count;
            }
        }
    }
}
