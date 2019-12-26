package com.pigmo.algorithm.substring;

public class Main {
    public static void main(String[] args) {
        String str = "人abc们def";
        SubString ss = new SubString(str, 8);
        ss.doAction();
        System.out.println("截取的字符串是： "+ss.getTarget());
    }
}
