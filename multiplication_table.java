package com.company;
import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args){
        int n,i,table;
        Scanner o = new Scanner(System.in);
        System.out.println("enter the number");
        n=o.nextInt();
        System.out.println("multiplication table of the given number is:");
        for (i=1;i<=10;i++){
            table=n*i;
            System.out.println(table);
        }
    }
}
