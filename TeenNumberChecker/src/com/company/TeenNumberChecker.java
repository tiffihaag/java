package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen (int x, int y, int z) {
        if (x > 12 && x < 20 || y > 12 && y < 20 || z > 12 && z < 20) {
            System.out.println("you have a teen");
            return true;
        }
        else {
            System.out.println("you don't have a teen");
            return false;
        }
    }

    public static boolean isTeen (int a) {
        if (a > 12 && a < 20) {
            System.out.println("yes that's a teen");
            return true;
        }
        System.out.println("nope");
        return false;
    }
}
