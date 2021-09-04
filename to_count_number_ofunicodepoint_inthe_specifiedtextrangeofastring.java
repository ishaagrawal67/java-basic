package com.company;

import java.util.Scanner;

public class to_count_number_ofunicodepoint_inthe_specifiedtextrangeofastring {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str=i.nextLine();
        System.out.println("enter the first and last index which you want to count between them unicode point");
        int v=i.nextInt();
        int m=i.nextInt();
        int c=str.codePointCount(v,m);
        System.out.println("the total number unicode character between them is "+c);
    }
}
