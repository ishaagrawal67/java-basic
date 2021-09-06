package com.company;

import java.util.Scanner;

public class get_substring_between_two_specified_position_27{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("enter the string");
        String str = i.nextLine();
        String new_str = str.substring(10, 20);
        System.out.println("substring which we get " + new_str);
    }
}
