package com.company;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, c=1;
        n= sc.nextInt();
        for (i=2;i<=n;i++){
            if (n%i==0){
                c+=1;
            }

        }
        if (c==2){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

    }
}
