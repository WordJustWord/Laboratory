package com.pigmo.algorithm.findmaxword;

public class Main {
    public static void main(String[] args) {
        String str ="asdfmgnwinabguoiwnbbbbbbbbbbqnonfedjj2j";

        FindMaxWord findMaxWord = new FindMaxWord(str);
        findMaxWord.doFind();
        System.out.println("最多出现的字母是： "+findMaxWord.getTarget());
        System.out.println("出现的次数是： "+findMaxWord.getMax());
    }
}
