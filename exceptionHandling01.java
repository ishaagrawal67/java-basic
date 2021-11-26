package com.company;

import java.util.Scanner;

public class exceptionHandling01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        try
        {
            int res=n/m;
            System.out.println("division result is: "+res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception message"+e.getMessage());
            System.out.println("you cannot devide a number by 0");
        }
        System.out.println("remaining code 1");
        System.out.println("remaining code 2");
    }
}
