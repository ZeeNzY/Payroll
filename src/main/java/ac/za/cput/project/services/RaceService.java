package ac.za.cput.project.services;

import ac.za.cput.project.domain.Race;

import java.util.Set;

public interface RaceService extends MainService<Race, String>{

    Set<Race> getAll();
}
