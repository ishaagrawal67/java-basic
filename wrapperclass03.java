package com.company;

public class wrapperclass03{
    public static void main(String[] args){
        //converting int to Integer
        int a=20;
        Integer i=Integer.valueOf(a);
        Integer j=i;
        System.out.println(a+" "+i+" "+j);
    }
}
