package com.company;
import java.util.Scanner;
public class productofnumber {
    static int product(int n)
    {
        int product =1;
        while(n!=0)
        {
            product=product*(n%10);
            n=n/10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int result=product(n);
        System.out.println(result);
    }
}
