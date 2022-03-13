package com.company;

public class bubbleSort_02 {
    public static void main(String[] args) {
        String[] a={"babli","eve","cati","amit","dev"};
        String temp;
        for(int i=0;i<a.length;i++)
        {
            int flag=0;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if (flag == 0){
                break;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
