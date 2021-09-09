package com.company;

import java.util.Scanner;

public class FIND_INDEX_OF_AN_ARRAY_ELEMENT_06{
    public static void main(String[] args) {
        Scanner os=new Scanner(System.in);
        System.out.println("enter the total number you wnt to store");
        int n,i,val;
        n=os.nextInt();
        System.out.println("enter the values you want to fin the index");
        val=os.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the values");
        for(i=0;i<n;i++)
        {
            arr[i]=os.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==val)
            {
                System.out.println("the index of the value "+val+ " is: "+i);
                break;
            }
        }
    }
}
