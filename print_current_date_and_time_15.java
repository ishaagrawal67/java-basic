package com.company;

import java.util.Calendar;

public class print_current_date_and_time_15{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("current date and time:");
        System.out.format("%tB %te, %tY%n",c,c,c);
        System.out.format("%tl:%tM %tp",c,c,c);
    }
}
