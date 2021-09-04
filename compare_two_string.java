package com.company;

import java.util.Scanner;

public class compare_two_string {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("enter the 2 string");
        String str1=i.nextLine();
        String str2=i.nextLine();
        int result=str1.compareTo(str2);
        if(result>0)
            System.out.println("\"" + str1 + "\"" + "is greator than " + "\"" + str2 + "\"");
        else if(result<0)
            System.out.println("\"" + str1 + "\"" + "is less than " + "\"" + str2 + "\"");
        else if (result==0)
            System.out.println("\"" + str1 + "\"" + "is equal than " + "\"" + str2 + "\"");
    }
}
