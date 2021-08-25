package com.company;
import java.util.Scanner;
public class cube_of_the_number {
    public static void main(String[] args){
        int n,cube,i;
        Scanner o = new Scanner(System.in);
        System.out.println("enter the number");
        n=o.nextInt();
        for (i=0;i<=n;i++)
        {
            cube=(i*i*i);
            System.out.println("cube of the number is :"+cube);
        }
    }
}
