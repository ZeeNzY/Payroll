package ac.za.cput.project.repository.imp;

import ac.za.cput.project.domain.Race;
import ac.za.cput.project.repository.RaceRepository;

import java.util.*;

public class RaceRepoImp implements RaceRepository {

    private static RaceRepoImp repository = null;
    private Map<String, Race> race;

    private RaceRepoImp(){
        this.race = new HashMap<>();
    }

    public static RaceRepository getRepository(){
        if (repository == null) repository = new RaceRepoImp();
        return repository;
    }


    @Override
    public Set<Race> getAll() {
        Collection<Race> races = this.race.values();
        Set<Race> set = new HashSet<>();
        set.addAll(races);
        return set;
    }

    @Override
    public Race create(Race race) {
        this.race.put(race.getRace(),race);
        return race;
    }

    @Override
    public Race update(Race race) {
        this.race.replace(race.getRace(),race);
        return this.race.get(race.getRace());
    }

    @Override
    public void delete(String s) {
        this.race.remove(s);
    }

    @Override
    public Race read(String s) {
        return this.race.get(s);
    }
}
