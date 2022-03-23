package com.company;

public class reversestring {
     void reverse(String str)
    {
        if((str==null)||str.length()<=1)
            System.out.println(str);
        else
        {
            System.out.println(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args)
    {
        String str="good is india";
        reversestring obj=new reversestring();
        obj.reverse(str);
    }
}
