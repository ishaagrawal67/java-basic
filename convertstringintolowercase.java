package com.company;

import java.util.Locale;
import java.util.Scanner;

public class convertstringintolowercase {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.println("enter the uppercase string");
        String str=st.nextLine();
        String uppercase=str.toLowerCase();
        System.out.println(uppercase);
    }
}
