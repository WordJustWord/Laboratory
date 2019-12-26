package com.pigmo.algorithm.firstpresentword;

public class Main {
    public static void main(String[] args) {
        String str = "dsfakkk1nfdsafsd";
        FirstPresentWord fpw = new FirstPresentWord(str);
        fpw.doFind();
        System.out.println("第一次出现的重复字符是： "+fpw.getTarget());
    }
}
