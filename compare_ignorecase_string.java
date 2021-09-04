package com.company;

import java.util.Scanner;

public class compare_ignorecase_string {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the string");
        String str1=i.nextLine();
        String str2=i.nextLine();
        int result=str1.compareToIgnoreCase(str2);
        if(result<0)
            System.out.println("\"" +str1 + "\"" + "is less than" + "\"" + str2 + "\"");
        else if(result==0)
            System.out.println("\"" +str1 + "\"" + "is equal to " + "\"" + str2 + "\"");
        else
            System.out.println("\"" +str1 + "\"" + "is greator than" + "\"" + str2 + "\"");
    }
}
