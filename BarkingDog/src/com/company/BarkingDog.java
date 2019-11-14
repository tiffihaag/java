package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        else if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            System.out.println("true");
            return true;
        }
        return false;
    }
}

