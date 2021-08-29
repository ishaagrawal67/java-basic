package com.company;
import java.util.Scanner;
public class sum_of_two_integer_is_equal_to_third_integer {
    public static void main(String[] args){
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the values of the number");
        a= in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if((a+b==c)||(b+c==a)||(a+c==b))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
