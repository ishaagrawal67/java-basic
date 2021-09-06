package com.company;

import java.util.Scanner;

public class trim_the_whitespace_from_string_c02{
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str=i.nextLine();
        String new_str=str.trim();
        System.out.println("removing whitespace from string is : "+new_str);
    }
}
