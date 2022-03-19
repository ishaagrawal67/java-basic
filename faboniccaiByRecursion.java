package com.company;

public class faboniccaiByRecursion {
    static int fabi(int n)
    {
        if(n<2)
            return n;
        return fabi(n-1)+fabi(n-2);
    }

    public static void main(String[] args) {
        int ans=fabi(4);
        System.out.println(ans);
    }
}
