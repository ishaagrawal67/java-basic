package com.company;

import java.util.Scanner;

public class exceptionhandling_04{
    public static void main(String[] args)
    {
        int[] m=new int[4];
        m[0]=2;
        m[1]=56;
        m[2]=67;
        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        int ind=sc.nextInt();
        while(flag) {

            try {
                System.out.println("welcome to nested try block");
                try {
                    System.out.println(m[ind]);
                    flag=false;
                } catch (ArrayIndexOutOfBoundsException e) {

                    System.out.println("this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("exception in level 1");
            }
        }
    }
}
