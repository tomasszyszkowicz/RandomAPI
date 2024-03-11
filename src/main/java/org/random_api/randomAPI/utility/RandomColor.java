package org.random_api.randomAPI.utility;

import java.util.Random;

public class RandomColor {

    private static final String googleURL = "https://www.google.com/search?q=";
    private String type;
    private String color;
    private String link;

    public RandomColor() {
        this("rgb");
    }

    public RandomColor(String type) {

        this.type = type;

        if(type.equals("hex")){
            this.color = getRandomHexColor();
            this.link = googleURL + "hex(" + this.color + ")";
        }else if(type.equals("rgb")){
            this.color = getRandomRGBColor();
            this.link = googleURL + "rgb(" + this.color + ")";
        }else{
            this.color = getRandomRGBColor();
            this.link = googleURL + "rgb(" + this.color + ")";
        }
    }

    private static String getRandomRGBColor() {
        Random random = new Random();
        // Generate random RGB values
        int red = random.nextInt(256);   // Red value (0-255)
        int green = random.nextInt(256); // Green value (0-255)
        int blue = random.nextInt(256);  // Blue value (0-255)

        // Return the RGB color in the format "R, G, B"
        return String.format("%d, %d, %d", red, green, blue);
    }

    private static String getRandomHexColor() {
        Random random = new Random();
        // Generate random RGB values and convert them to a hexadecimal string
        String hex = String.format("#%02X%02X%02X", random.nextInt(256), random.nextInt(256), random.nextInt(256));

        // Return the hexadecimal color
        return hex;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public String getLink() {
        return link;
    }

    
}
