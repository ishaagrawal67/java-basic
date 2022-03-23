package com.company;
import java.util.Scanner;
public class sumofnumbers {
    static int sumofnumbers(int n)
    {
        if(n<=1)
            return n;
        return n+sumofnumbers(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofnumbers(n));
    }
}
