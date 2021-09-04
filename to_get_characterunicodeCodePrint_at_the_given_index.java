package com.company;

import java.util.Scanner;

public class to_get_characterunicodeCodePrint_at_the_given_index {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str=i.nextLine();
        System.out.println("enter the index of that character you want to search");
        int m=i.nextInt();
        int n=i.nextInt();
        int v1=str.codePointAt(m);
        int v2=str.codePointAt(n);
        System.out.println("the character (unicode point) is "+v1);
        System.out.println("the character(unicode point) is "+v2);

    }
}
