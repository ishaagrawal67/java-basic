package com.company;
import java.util.Scanner;

public class palindromeByRecursion {
    static int rev(int n,int t)
    {
        if(n==0)
            return t;
        t=(t*10)+(n%10);
        return rev(n/10 , t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int t=rev(p,0);
        if(t==p)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
