package org.random_api.randomAPI.utility;

/**
 * The RandomDate class represents a randomly generated date.
 */
public class RandomDate {
    private int year;
    private int month;
    private int day;
    private String date;

    /**
     * Constructs a RandomDate object with a random date between 1900 and 2020.
     */
    public RandomDate() {
        this(1900, 2020);
    }

    /**
     * Constructs a RandomDate object with a random date between the specified minimum and maximum years.
     *
     * @param minYear the minimum year
     * @param maxYear the maximum year
     */
    public RandomDate(int minYear, int maxYear) {
        this.year = (int) (Math.random() * (maxYear - minYear + 1) + minYear);
        this.month = (int) (Math.random() * 12 + 1);
        this.day = (int) (Math.random() * 31 + 1);
        this.date = this.year + "-" + this.month + "-" + this.day;
    }

    /**
     * Returns the year of the random date.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns the month of the random date.
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Returns the day of the random date.
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * Returns the random date in the format "yyyy-MM-dd".
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }
}
