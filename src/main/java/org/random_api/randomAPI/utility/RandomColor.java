package org.random_api.randomAPI.utility;

import java.util.Random;

/**
 * The RandomColor class generates random colors in different formats.
 */
public class RandomColor {

    private static final String googleURL = "https://www.google.com/search?q=";
    private String type;
    private String color;
    private String link;

    /**
     * Constructs a RandomColor object with the default type "rgb".
     */
    public RandomColor() {
        this("rgb");
    }

    /**
     * Constructs a RandomColor object with the specified type.
     * 
     * @param type the type of color ("hex" or "rgb")
     */
    public RandomColor(String type) {
        this.type = type;

        if (type.equals("hex")) {
            this.color = getRandomHexColor();
            this.link = googleURL + "hex(" + this.color + ")";
        } else if (type.equals("rgb")) {
            this.color = getRandomRGBColor();
            this.link = googleURL + "rgb(" + this.color + ")";
        } else {
            this.color = getRandomRGBColor();
            this.link = googleURL + "rgb(" + this.color + ")";
        }
    }

    /**
     * Generates a random RGB color.
     * 
     * @return the RGB color in the format "R, G, B"
     */
    private static String getRandomRGBColor() {
        Random random = new Random();
        int red = random.nextInt(256);   // Red value (0-255)
        int green = random.nextInt(256); // Green value (0-255)
        int blue = random.nextInt(256);  // Blue value (0-255)

        return String.format("%d, %d, %d", red, green, blue);
    }

    /**
     * Generates a random hexadecimal color.
     * 
     * @return the hexadecimal color
     */
    private static String getRandomHexColor() {
        Random random = new Random();
        String hex = String.format("#%02X%02X%02X", random.nextInt(256), random.nextInt(256), random.nextInt(256));

        return hex;
    }

    /**
     * Returns the generated color.
     * 
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Returns the type of color.
     * 
     * @return the type of color ("hex" or "rgb")
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the Google search link for the color.
     * 
     * @return the Google search link
     */
    public String getLink() {
        return link;
    }
}
