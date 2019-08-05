package ac.za.cput.project.repository;

import ac.za.cput.project.domain.Race;

import java.util.Map;
import java.util.Set;

public interface RaceRepository extends MainRepository<Race, String> {

    Set<Race> getAll();
}
