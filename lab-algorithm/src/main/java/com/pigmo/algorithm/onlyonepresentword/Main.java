package com.pigmo.algorithm.onlyonepresentword;

public class Main {
    public static void main(String[] args) {
        String str = "jsgwbjjjjsdmbgjabwjhq";
        OnlyOnePresentWord oopw = new OnlyOnePresentWord(str);
        oopw.doFind();
        System.out.println("第一个只出现一次的字符： "+oopw.getTarget());
    }
}
