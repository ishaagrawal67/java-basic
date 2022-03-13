package com.company;

public class selectionSort_02 {
    public static void main(String[] args) {
    String[] a={"deepak","rahul","ramesh","bhumi","amit"};
    int min;
    String temp=" ";
        for(int i=0;i<a.length;i++)
    {
        min=i;
        for(int j=i;j<a.length;j++)
        {
            if(a[j].compareTo(a[min])<0)
                min=j;
        }
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+" ");
    }
}

