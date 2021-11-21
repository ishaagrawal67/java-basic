package com.company;

public class wrapperclass01 {
    public static void main(String[] args)
    {
        Integer o1=new Integer(44);
        Integer o2=new Integer("44");
        Integer o3=new Integer(55);
        //compareTo() method
        System.out.println("using compareTo() obj1 and obj2: " +o1.compareTo(o2));
        System.out.println("using compareTo() obj1 and obj2: " +o1.compareTo(o3));
        //Equals() method
        System.out.println("using equals() obj1 and obj2: " +o1.equals(o2));
        System.out.println("using equals() obj1 and obj2: " +o1.equals(o3));
        Float f1=new Float("10.25f");
        Float f2=new Float("12.63f");
        Float f3=new Float(10.25f);
        System.out.println("using compare() f1 and f2:"+Float.compare(f1,f2));
        System.out.println("using compare() f1 and f3:"+Float.compare(f1,f3));
        //addition of integer with float
        Float f=o1.floatValue();
        System.out.println(f);
        Float f0=o1.floatValue()+f1;
        System.out.println("adddition of intobj1 and f1: "+o1+"+"+f1+"="+f0);
        Integer int1=Integer.valueOf("12345");
        //converting from binary to decimal
        Integer int2=Integer.valueOf("101011",2);
        //converting from hexadecimal to decimal
        Integer int3=Integer.valueOf("D",16);
        System.out.println("value of int2 object: "+int1);
        System.out.println("value of int2 object: "+int2);
        System.out.println("value of int3 object: "+int3);
        System.out.println("hexadecimal of int1:"+Integer.toHexString(int1));
        System.out.println("binary value of int2: "+Integer.toBinaryString(int2));
    }
}
