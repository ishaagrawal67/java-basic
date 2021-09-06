package com.company;

import java.util.Scanner;

public class check_string_starts_with_the_content_of_another_string_26{
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str=i.nextLine();
        System.out.println("enter the string you want to check ");
        String str2=i.nextLine();
        boolean new_str=str.startsWith(str2);
        System.out.println(str+ "starts with " +str2+ "? "+new_str);
    }
}
