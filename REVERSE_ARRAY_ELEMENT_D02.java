package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class REVERSE_ARRAY_ELEMENT_D02{
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        System.out.println("enter the toal number");
        int n,i;
        n=os.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values");
        for(i=0;i<n;i++)
        {
            arr[i]=os.nextInt();
        }
        System.out.println("reverse array is:");
        for(i=n-1;i>=0;i--) {
            System.out.println(arr[i]);
        }
    }
}
