package com.pigmo.algorithm.stringreverse;

import lombok.Getter;

public class StringReverse {
    private String res;
    @Getter
    private String target;

    public StringReverse(String str) {
        res = str;
    }

    public void doReverse() {
        StringBuilder sb = new StringBuilder();
        for (int i = res.length(); i > 0; i--) {
            sb.append(res.charAt(i - 1));
        }
        target = sb.toString();
    }
}
