package com.company;
import java.util.Scanner;
public class take_input_find_sum_avg {
    public static void main(String[] args){
        int a,b,sum,avg;
        Scanner o = new Scanner(System.in);
        System.out.println("enter the values to find sum and avg");
        a=o.nextInt();
        b=o.nextInt();
        sum=a+b;
        avg=(a+b)/2;
        System.out.println("sum of the values is :" +sum);
        System.out.println("average of the value is :" + avg);
    }
}
