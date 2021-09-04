package com.company;

import java.util.Scanner;

public class to_get_characterUnicode_before_specified_index {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str=i.nextLine();
        int n=i.nextInt();
        int v1=str.codePointBefore(n);
        System.out.println("the character(unicode) before " +v1);
    }
}
