package com.company;

import java.util.Scanner;

public class SUM_VALUES_OFARRAY_02{
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("enter the total number of variable you want in your array:");
        n=os.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values in array:");
        for(i=0;i<n;i++)
        {
            arr[i]=os.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum of tha values from the array: "+sum);
    }
}
