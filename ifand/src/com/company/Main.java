package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean isAlien = false;
	    if (isAlien == false) {
            System.out.println("It isn't an alien");
            System.out.println("And I'm scared of aliens");
        }

	    int topScore = 80;
	    if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

	    int secondTopScore = 60;
	    if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater than 2nd top score and less than 100");
        }

	    if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both are true.");
        }

	    int newValue = 50;
	    if (newValue == 50) {
            System.out.println("this is true");
        }

	    boolean isCar = false;
	    if (isCar == true) {
            System.out.println("double equal necessary");
        }

        isCar = true;
	    boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        double myModulusAnswer = myValuesTotal % 40.00d;
        System.out.println("remainder is = " + myModulusAnswer);
        boolean checkAnswer = (myModulusAnswer == 0) ? true : false;
        System.out.println("no remainder is " + checkAnswer);
        if (!checkAnswer) {
            System.out.println("Got a remainder");
        }


    }
}
