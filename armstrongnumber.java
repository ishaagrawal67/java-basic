package com.company;
import java.util.Scanner;
public class armstrongnumber{
    public static void main(String[] args){
       int a,original,result=0 ,rem;
       Scanner i = new Scanner(System.in);
        System.out.println("enter the number");
        a=i.nextInt();
        original=a;
        while (original!=0)
        {
            rem=original % 10;
            result = result + (rem*rem*rem);
            original = original/10;
        }
        if (result==a)
            System.out.println("number is armstrong ");
        else
            System.out.println("number is not armstrong");
    }
}
