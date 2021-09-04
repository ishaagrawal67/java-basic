package com.company;

import java.util.Scanner;

public class two_string_contain_the_same_data {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the strings");
        String str1=i.nextLine();
        String str2=i.nextLine();
        boolean compare=str1.equals(str2);
        System.out.println("the content of two given string is : "+compare);
    }
}
