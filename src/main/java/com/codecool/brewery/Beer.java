package com.codecool.brewery;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Represents a beer produced by the brewery.
 * This is a basic implementation - you need to extend this to support different beer types.
 */
public abstract class Beer {
    String name;
    double alcoholContent;
    LocalDate productionDate;

    Beer(String name, double alcoholContent, LocalDate productionDate) {
        if(alcoholContent<0 || alcoholContent > 100){
            throw new IllegalArgumentException("Alcohol content must be 0-100");
        }
        this.name = name;
        this.alcoholContent = alcoholContent;
        this.productionDate = productionDate;
    }

    // TODO: Add method to calculate days until beer is ready for sale
    // TODO: Consider how to handle different fermentation times for different beer types
    public int getDaysUntilReady() {
        LocalDate readyDate = productionDate.plusDays(getFermentationDays());
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), readyDate);
    }

    public abstract int getFermentationDays();
    public abstract boolean canBeStoredAt(double temperature);

    
}
