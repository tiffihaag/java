package com.company;

public class LeapYear {
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            System.out.println("not");
            return false;
        }

        else if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println("yes, it's a leap year");
            return true;
        }
        System.out.println("not a leap year");
        return false;
    }
}



