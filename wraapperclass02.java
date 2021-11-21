package com.company;

public class wraapperclass02 {
    public static void main(String[] args) {
        System.out.println("example of autoboxing");
        int a=50;
        Integer b=Integer.valueOf(a);
        Integer c=a+b;
        System.out.println("a:"+a+"b:"+b+"c: "+c);
        System.out.println("example of unboxing");
        Integer x=new Integer(15);
        int y=x.intValue();
        int z=x*y;
        System.out.println("x:"+x+" y: "+y+" z: "+z);
    }
}
