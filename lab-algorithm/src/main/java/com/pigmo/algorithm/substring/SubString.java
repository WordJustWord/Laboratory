package com.pigmo.algorithm.substring;

import lombok.Getter;

public class SubString {
    private String res;
    @Getter
    private String target;
    private int targetCount;

    public SubString(String str, int targetCount) {
        this.res = str;
        this.targetCount = targetCount;
    }

    public void doAction() {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < res.length(); i++) {
            int length = String.valueOf(res.charAt(i)).getBytes().length;
            if (count+length <= targetCount) {
                count += length;
                sb.append(res.charAt(i));
            }
            else {
                break;
            }
        }
        target = sb.toString();
    }
}
