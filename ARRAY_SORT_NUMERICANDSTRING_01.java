package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_SORT_NUMERICANDSTRING_01{
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        int n,i,j;
        System.out.println("enter the total number which you want to store");
        n=os.nextInt();
        int  [] arr=new int[n];
        String [] arr1=new String[n];
        System.out.println("enter the numeric values:");
        for(i=0;i<n;i++)
        {
            arr[i]=os.nextInt();
        }
        System.out.println("enter the string value:");
        for(j=0;j<n;j++)
        {
            arr1[j]=os.next();
        }
        System.out.println("numeric array");
       for (i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("string array");
        for(j=0;j<n;j++){
            System.out.println(arr1[j]);
        }
        System.out.println("original numeric array"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted numeric array"+Arrays.toString(arr));
        System.out.println("original string array "+Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("sorted string array "+Arrays.toString(arr1));
    }
}
