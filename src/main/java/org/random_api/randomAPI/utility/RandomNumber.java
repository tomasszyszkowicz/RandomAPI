package org.random_api.randomAPI.utility;

/**
 * The RandomNumber class represents a random number within a specified range.
 */
public class RandomNumber {
    private int value;

    /**
     * Constructs a RandomNumber object with a default range of 0 to 100.
     */
    public RandomNumber() {
        this(0, 100);
    }

    /**
     * Constructs a RandomNumber object with the specified range.
     *
     * @param min the minimum value of the range (inclusive)
     * @param max the maximum value of the range (inclusive)
     */
    public RandomNumber(int min, int max) {
        this.value = (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Returns the value of the random number.
     *
     * @return the value of the random number
     */
    public int getValue() {
        return value;
    }
}
