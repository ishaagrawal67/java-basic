package com.company;

import java.util.Scanner;

public class create_characyer_array28{
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string you want to convert it into character array");
        String str=i.nextLine();
        char [] arr= str.toCharArray();
        System.out.println(arr);
    }
}
