package ac.za.cput.project.services.imp;

import ac.za.cput.project.domain.Race;
import ac.za.cput.project.repository.RaceRepository;
import ac.za.cput.project.repository.imp.RaceRepoImp;
import ac.za.cput.project.services.RaceService;

import java.util.Set;

public class RaceServiceImp implements RaceService {


    private static RaceServiceImp service = null;
    private RaceRepository repository;

    private RaceServiceImp(){
        this.repository = RaceRepoImp.getRepository();
    }

    public static RaceServiceImp getService(){
        if (service == null) service = new RaceServiceImp();
        return service;
    }
    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String i) {
        this.repository.delete(i);
    }

    @Override
    public Race read(String i) {
        return this.repository.read(i);
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }
}
