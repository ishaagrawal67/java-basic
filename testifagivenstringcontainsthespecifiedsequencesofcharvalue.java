package com.company;

import java.util.Scanner;

public class testifagivenstringcontainsthespecifiedsequencesofcharvalue {
    public static void main(String[] args) {
        Scanner i= new Scanner(System.in);
        System.out.println("enter the string");
        String str1=i.nextLine();
        System.out.println("enter the specified sequence of the char");
        String str2=i.nextLine();
        boolean v=str1.contains(str2);
        System.out.println(v);
    }
}
