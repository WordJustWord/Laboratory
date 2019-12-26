package com.pigmo.algorithm.phonenumberesc;

public class Main {
    public static void main(String[] args) {
        String phoneNumber = "15208298189";
        PhoneNumberEscOutput pneo = new PhoneNumberEscOutput(phoneNumber);
        pneo.doAction();
        System.out.println("结果是： "+pneo.getTarget());
    }
}
