package com.pigmo.algorithm.phonenumberesc;

import lombok.Getter;

import java.util.TreeMap;

/**
 * 手机号数字出现的次数并升序输出
 */
public class PhoneNumberEscOutput {
    private String phoneNumber;
    @Getter
    private String target;

    public PhoneNumberEscOutput(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void doAction(){
        TreeMap<Character,Integer> tmap = new TreeMap<>();
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            Integer count = tmap.get(c);
            if (count == null){
                count = 1;
            }
            else {
                count++;
            }
            tmap.put(c,count);
        }
        this.target = tmap.toString();
    }
}
