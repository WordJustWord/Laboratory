package com.pigmo.algorithm.firstpresentword;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

/**
 * 查找第一次出现重复的字符
 */
public class FirstPresentWord {
    private String res;
    @Getter
    private Character target;

    public FirstPresentWord(String str) {
        this.res = str;
    }

    public void doFind() {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < this.res.length(); i++) {
            boolean flag = set.add(this.res.charAt(i));
            if (!flag) {
                this.target = this.res.charAt(i);
                return;
            }
        }
    }
}
