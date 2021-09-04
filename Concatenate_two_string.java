package com.company;

import java.util.Scanner;

public class Concatenate_two_string {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str1=i.nextLine();
        String str2=i.nextLine();
        String str3=str1.concat(str2);
        System.out.println("the concatenate of two string is "+str3);
    }
}
