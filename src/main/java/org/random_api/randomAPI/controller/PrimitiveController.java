package org.random_api.randomAPI.controller;
import org.random_api.randomAPI.utility.RandomNumber;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.random_api.randomAPI.utility.RandomCharacter;


@RestController
public class PrimitiveController {

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

    @GetMapping("/character")
    public RandomCharacter character() {
        return new RandomCharacter();
    }

    @GetMapping("/test")
    public String test() {
        return "API is working";
    }
}