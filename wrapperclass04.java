package com.company;

public class wrapperclass04{
    public static void main(String[] args) {
        //converting Integer to int
        Integer a=Integer.valueOf(3);
        int i=a.intValue();
        int j=i;
        System.out.println(a+"\n "+i+"\n "+j);
    }
}
