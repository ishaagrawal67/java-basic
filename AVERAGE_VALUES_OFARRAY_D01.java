package com.company;

import java.util.Scanner;

public class AVERAGE_VALUES_OFARRAY_D01{
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        int i,n,avg,sum=0;
        System.out.println("enter the total number of terams you want");
        n=os.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values");
        for(i=0;i<n;i++)
        {
            arr[i]=os.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("the average of the values is: "+avg);
    }
}
