package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1+2=3
        System.out.println("1 plus 2 equals " + result);

        int previousResult = result;
        System.out.println("previous result = " + previousResult);
        result = result - 1;
        System.out.println(result);
        System.out.println("3 - 1 = " + previousResult);

        result++; // result +1
        result--; // result -1
        result += 2; //is adding 2
        result *= 10; //multiply by 10
        result /= 3; //divides by 3
        result -= 2; //minus 2
    }
}
