package com.company;

public class exceptionhandling_03 {
    public static void main(String[] args)
    {
        int[] m=new int[4];
        m[0]=2;
        m[1]=56;
        m[2]=67;
        try
        {
            System.out.println("welcome to nested try block");
            try
            {
                System.out.println(m[9]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {

                System.out.println("this index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e)
        {
            System.out.println("exception in level 1");
        }
    }
}
