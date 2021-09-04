package com.company;

import java.util.Scanner;

public class compare_given_string_tothe_specified_sequence_chraracter {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the strings");
        String str1=i.nextLine();
        String str2=i.nextLine();
        System.out.println("enter the specified sequences character");
        CharSequence name= i.nextLine();
        System.out.println("comparing " +str1+ " and " +name+ " : " +str1.contentEquals(name));
        System.out.println(" comparing " +str2+ " and " +name+ " : " +str2.contentEquals(name));

    }
}
