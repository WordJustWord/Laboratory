package com.pigmo.algorithm.stringreverse;

public class Main {
    public static void main(String[] args) {
        String str = "abcdefghijklmn";
        StringReverse sr = new StringReverse(str);
        sr.doReverse();
        System.out.println("反转的字符串是： "+sr.getTarget());
    }
}
