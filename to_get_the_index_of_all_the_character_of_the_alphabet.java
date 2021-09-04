package com.company;

import java.util.Scanner;

public class to_get_the_index_of_all_the_character_of_the_alphabet {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str1=i.nextLine();
        System.out.println("enter the character you want to search the index");
        char ch=i.next().charAt(0);
        int v=str1.indexOf(ch);
        System.out.println("the index of given character "+ch+" is at" +v);
    }
}
