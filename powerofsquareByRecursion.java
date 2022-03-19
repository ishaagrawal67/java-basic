package com.company;

public class powerofsquareByRecursion {
    static int power(int p,int r)
    {
        if(r==0)
            return 1;
        else
            return p * power(p,r-1);
    }

    public static void main(String[] args) {
        int ans=power(3,2);
        System.out.println(ans);
    }
}
