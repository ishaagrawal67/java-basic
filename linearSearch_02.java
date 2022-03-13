package com.company;

public class linearSearch_02 {
    public static void main(String[] args) {
        String[] a={"riya","liya","oppo","lixo"};
        String item ="lixo";
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==item)
            {
                System.out.println("element is present at" + i + "index position");
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("item is not found");
        }
    }
}
