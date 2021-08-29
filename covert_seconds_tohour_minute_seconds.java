package com.company;

import java.util.Scanner;

public class covert_seconds_tohour_minute_seconds {
    public static void main(String[] args){
        int n,s,h,m;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the time in seconds");
        n=in.nextInt();
        s=n%60;
        h=n/60;
        m=h%60;
        h=h/60;
        System.out.println(h +":" + m +":" + s);
    }
}
