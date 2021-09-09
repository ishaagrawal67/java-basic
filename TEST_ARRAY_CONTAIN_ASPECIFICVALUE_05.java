package com.company;

import java.util.Scanner;

public class TEST_ARRAY_CONTAIN_ASPECIFICVALUE_05{
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        int n,i,tofind;
        boolean chk=false;
        System.out.println("enter the terms you wants in array");
        n=os.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the value you wnt to check");
        tofind=os.nextInt();
        System.out.println("enter the values in array:");
        for(i=0;i<n;i++)
        {
            arr[i]=os.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==tofind)
            {
                chk=true;
                break;
            }
        }
        if(chk)
        {
            System.out.println(chk+"the value is specified in the array");
        }
        else
            System.out.println(chk+"no value required");
    }
}
