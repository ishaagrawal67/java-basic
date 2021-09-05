package com.company;

import java.util.Scanner;

public class replace_chracter_with_another_24 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str = i.nextLine();
        System.out.println("enter the character you want to replace ");
        char ch=i.next().charAt(0);
        System.out.println("enter the character you want to replace with another ");
        char ch2=i.next().charAt(0);
        String new_str=str.replace(ch2,ch);
        System.out.println("new string is "+new_str);
    }
}
