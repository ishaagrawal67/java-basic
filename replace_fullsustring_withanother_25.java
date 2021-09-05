package com.company;

import java.util.Scanner;

public class replace_fullsustring_withanother_25 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str=i.nextLine();
        System.out.println("enter the substring you wnat to replace");
        String str2=i.next();
        System.out.println("enter the new string");
        String str3=i.next();
        String new_str=str.replaceAll(str2,str3);
        System.out.println("new string"+new_str);
    }
}
