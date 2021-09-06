package com.company;

import java.util.Scanner;

public class convert_string_uppercase_c01{
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str1=i.nextLine();
        String upper_str=str1.toUpperCase();
        System.out.println("the lower case string is : "+str1);
        System.out.println("upper case string is : "+upper_str);
    }
}
