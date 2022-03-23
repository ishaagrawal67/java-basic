package com.company;
import java.util.Scanner;
public class fibonachiseries {
    static int n1=0,n2=1,n3=0;
    static void fibonacci(int c)
    {
        if(c>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(" "+n3);
            fibonacci(c-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int c=sc.nextInt();
        System.out.println(n1 + " " + n2);
        fibonacci(c-2);
    }
}
