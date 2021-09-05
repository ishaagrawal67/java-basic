package com.company;

import java.util.Scanner;

public class get_length_of_the_string_22 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str=i.nextLine();
        int len=str.length();
        System.out.println("the length of the string " +str+ "is :" +len);
    }
}
