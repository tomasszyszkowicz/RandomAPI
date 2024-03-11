package org.random_api.randomAPI.utility;

import java.util.Random;

public class RandomCharacter {
    private char value;

    public RandomCharacter() {
        // Default character set: 'A' to 'Z'
        Random random = new Random();
        this.value = (char) ('A' + random.nextInt('Z' - 'A' + 1));
    }

    // Getter for the value field
    public char getValue() {
        return value;
    }
}
