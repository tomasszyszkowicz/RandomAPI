package org.random_api.randomAPI.utility;

// create a number class with two constructors one with no arguments and the other with two arguments min and max. The class will have one instance field called value and it will be a random based on min and max

public class RandomNumber {
    private int value;

    public RandomNumber() {
        this(0, 100);
    }

    public RandomNumber(int min, int max) {
        this.value = (int) (Math.random() * (max - min + 1) + min);
    }

    //getters and setters

    public int getValue() {
        return value;
    }
}
