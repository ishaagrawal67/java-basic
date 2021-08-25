package com.company;
import java.util.Scanner;
public class odd_n_natural_number {
    public static void main(String[] args){
        int n,i;
        Scanner o = new Scanner(System.in);
        System.out.println("enter the number");
        n=o.nextInt();
        for (i=1;i<=n;i++){
            if (i%2!=0)
                System.out.println("number is odd number : "+i);
        }
    }
}
