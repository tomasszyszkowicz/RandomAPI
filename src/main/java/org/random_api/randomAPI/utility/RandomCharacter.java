package org.random_api.randomAPI.utility;

import java.util.Random;

/**
 * The RandomCharacter class represents a randomly generated character.
 */
public class RandomCharacter {
    private char value;

    /**
     * Constructs a RandomCharacter object with a randomly generated character.
     * The default character set is 'A' to 'Z'.
     */
    public RandomCharacter() {
        Random random = new Random();
        this.value = (char) ('A' + random.nextInt('Z' - 'A' + 1));
    }

    /**
     * Returns the value of the randomly generated character.
     *
     * @return the value of the character
     */
    public char getValue() {
        return value;
    }
}
