package com.company;

import java.util.Scanner;

public class exceptionhandling_02{
    public static void main(String[] args){
        int[] m=new int[5];
        m[0]=1;
        m[1]=56;
        m[2]=67;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the array index");
        int index=sc.nextInt();
        System.out.println("enter the number you want to divide the value with");
        int num= sc.nextInt();
        try
        {
            System.out.println("the value at array index entered is:"+m[index]);
            System.out.println("the value of array value/number is : "+m[index]/num);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception occured:");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occured :");
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("some other exception occured :");
        }
    }
}
