package com.company;

public class numberdivisibleby_3_5_by_both{
    public static void main(String[] args){
        int i=1;
        System.out.println("number divisible by 3:");
        for (i=1;i<=100;i++){
            if(i%3==0)
                System.out.print(i +" , ");
        }
        System.out.println("\n\n number divisible by 5:");
        for(i=1;i<=100;i++){
            if(i%5==0)
                System.out.print(i +" , ");
        }
        System.out.println("\n\nnumber divisible by 3 or 5 both:");
        for(i=1;i<=100;i++){
            if(i%3==0 && i%5==0)
                System.out.print(i + " , ");
        }
    }
}
