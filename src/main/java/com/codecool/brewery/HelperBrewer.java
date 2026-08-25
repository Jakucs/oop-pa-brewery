package com.codecool.brewery;

import java.time.DayOfWeek;
import java.util.Set;

public class HelperBrewer extends Brewer{
    private final Set<DayOfWeek> workDays;

    HelperBrewer(String name, int yearsOfExperience, Set<DayOfWeek> workDays) {
        super(name, yearsOfExperience);
        this.workDays = Set.copyOf(workDays);
    }

    @Override
    public boolean isAvailableOn(DayOfWeek day) {
        return workDays.contains(day);
    }

    @Override
    public String getRole() {
        return "Helper";
    }
}