package com.company;
import java.util.Scanner;
public class triangle_is_valid_or_not {
    public static void main(String[] args){
        int a,b,c;
        Scanner i = new Scanner(System.in);
        System.out.println("enter the values of side:");
        a=i.nextInt();
        b=i.nextInt();
        c=i.nextInt();
        if ((a+b>=c)&&(a+c>=b)&&(b+c>=a))
            System.out.println("triangle is valid");
        else
            System.out.println("triangle is not valid");
    }
}
