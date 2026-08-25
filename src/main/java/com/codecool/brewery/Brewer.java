package com.codecool.brewery;

import java.time.DayOfWeek;

/**
 * Represents a brewer working at the brewery.
 * You need to extend this class to support different types of brewers.
 */
public abstract class Brewer {
    String name;
    int yearsOfExperience;

    Brewer(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    // TODO: Add method to check if brewer is available on a specific day
    // TODO: Consider how different types of brewers have different schedules
    // TODO: Consider isAvailableOn may accept parameters for day checks
    public abstract boolean isAvailableOn(DayOfWeek day);
    public abstract String getRole();
}
