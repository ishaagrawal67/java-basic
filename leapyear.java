package com.company;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args){
        int year;
        Scanner i = new Scanner(System.in);
        System.out.println("enter the year");
        year=i.nextInt();
        if((year%400==0)||((year%4==0)&&(year%100!=0)))
            System.out.println("year "+year+" is leap year");
        else
            System.out.println("year" + year +" is not a leap year");

    }
}
