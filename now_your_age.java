//This program print your current age after given your date of birth
package com.company;
import java.util.Scanner;
public class now_your_age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, m;
        String s;
        System.out.println("Enter your name ");
        s= sc.next();
        System.out.println("Enter the your birth year");
        n= sc.nextInt();
        m=2021-n;
        System.out.println(s+", you are born in "+n+" and now your are "+m);
    }
}
