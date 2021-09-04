package com.company;

import java.util.Scanner;

public class to_get_a_character_with_index {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("enter the string");
        String str = i.nextLine();
        int index1 = str.charAt(0);
        int index2 = str.charAt(5);
        System.out.println("the character at index 0 is " + (char)index1);
        System.out.println("the character at index 0 is " + (char)index2);
    }
}
