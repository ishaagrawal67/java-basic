package com.company;
import java.util.Scanner;
public class prime {
    static int prime(int i,int n)
    {
        if(n==i)
            return 0;
        else
            if(n%i==0)
                return 1;
            else
                return prime(i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            if(prime(2,i)==0)
                System.out.println(i+" ");
        }
    }
}
