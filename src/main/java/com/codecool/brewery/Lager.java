package com.codecool.brewery;

import java.time.LocalDate;

public class Lager extends Beer{

    Lager(String name, double alcoholContent, LocalDate productionDate) {
        super(name, alcoholContent, productionDate);
    }

    @Override
    public int getFermentationDays() {
        return 21;
    }

    @Override
    public boolean canBeStoredAt(double temperature) {
        return temperature<5.0;
    }
}
