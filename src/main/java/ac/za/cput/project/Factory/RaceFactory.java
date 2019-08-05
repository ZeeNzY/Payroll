package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.Race;

import java.util.Locale;

public class RaceFactory {

    public static Race getRace(String race){
        return new Race.Builder().race(race)
                .build();
    }
}
