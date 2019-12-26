package com.pigmo.algorithm.onlyonepresentword;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 第一个只出现一次的字符
 */
public class OnlyOnePresentWord {
    private String res;
    @Getter
    private Character target;

    public OnlyOnePresentWord(String str) {
        this.res = str;
    }

    public void doFind() {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < res.length(); i++) {
            char c = res.charAt(i);
            Integer count = map.get(c);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(c,count);
        }
        for (int i = 0; i < res.length(); i++) {
            if(map.get(res.charAt(i)) == 1){
                target = res.charAt(i);
                return;
            }
        }
    }
}
