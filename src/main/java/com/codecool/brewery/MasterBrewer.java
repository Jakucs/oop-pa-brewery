package com.codecool.brewery;

import java.time.DayOfWeek;
import java.util.List;

public class MasterBrewer extends Brewer{

    MasterBrewer(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    @Override
    public boolean isAvailableOn(DayOfWeek day) {
        return true;
    }

    @Override
    public String getRole() {
        return "Master";
    }

    public int brewBeer(Beer beer, DayOfWeek day, List<HelperBrewer> helpers){
        return (int) helpers.stream()
                .filter(h->h.isAvailableOn(day))
                .count();
    }
}
