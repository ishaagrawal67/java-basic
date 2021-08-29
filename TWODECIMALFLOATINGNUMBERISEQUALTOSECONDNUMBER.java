package com.company;

import java.util.Scanner;

public class TWODECIMALFLOATINGNUMBERISEQUALTOSECONDNUMBER {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.println("enter the first floating number");
        double m=i.nextDouble();
        System.out.println("enter another floating point number");
        double n=i.nextDouble();
        if(m==n)
            System.out.println("they are same");
        else
            System.out.println("they are different");

    }
}
