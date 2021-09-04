package com.company;

import java.util.Scanner;

public class check_string_ends_with_content_of_another_string {
    public static void main(String[] args) {
        Scanner i= new Scanner(System.in);
        System.out.println("enter the string");
        String str1=i.nextLine();
        System.out.println("enter the last value which you find");
        String strEnd=i.nextLine();
        boolean endpoint=str1.endsWith(strEnd);
        System.out.println("\"" +str1+ "\"" + "ends with" + "\"" +strEnd+ "\"" +":"+endpoint);
    }
}
