package org.random_api.randomAPI.controller;
import org.random_api.randomAPI.utility.RandomNumber;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.random_api.randomAPI.utility.RandomCharacter;
import org.random_api.randomAPI.utility.RandomColor;

// This is the controller class for handling primitive API requests

@RestController
public class PrimitiveController {

    /**
     * Generates a random number within the specified range.
     * If no range is provided, a random number between Integer.MIN_VALUE and Integer.MAX_VALUE is generated.
     *
     * @param min the minimum value of the range (optional)
     * @param max the maximum value of the range (optional)
     * @return a RandomNumber object representing the generated random number
     */
    @GetMapping("/number")
    public RandomNumber number(@RequestParam(value = "min", required = false) Integer min,
                               @RequestParam(value = "max", required = false) Integer max) {
        if (min == null && max == null) {
            return new RandomNumber(); // No parameters constructor
        } else {
            // Providing default values if only one parameter is given
            int actualMin = (min != null) ? min : Integer.MIN_VALUE; // Default min value
            int actualMax = (max != null) ? max : Integer.MAX_VALUE; // Default max value
            return new RandomNumber(actualMin, actualMax);
        }
    }

    /**
     * Generates a random character.
     *
     * @return a RandomCharacter object representing the generated random character
     */
    @GetMapping("/character")
    public RandomCharacter character() {
        return new RandomCharacter();
    }

    /**
     * Generates a random color in the specified format.
     * If no format is provided, the default format is "rgb".
     *
     * @param type the format of the color (optional)
     * @return a RandomColor object representing the generated random color
     */
    @GetMapping("/color")
    public RandomColor color(@RequestParam(value = "type", required = false, defaultValue = "rgb") String type) {
        return new RandomColor(type);
    }

    /**
     * A test endpoint to check if the API is working.
     *
     * @return a string indicating that the API is working
     */
    @GetMapping("/test")
    public String test() {
        return "API is working";
    }
}