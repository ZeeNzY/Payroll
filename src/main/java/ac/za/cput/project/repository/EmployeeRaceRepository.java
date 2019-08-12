package ac.za.cput.project.repository;

import ac.za.cput.project.domain.EmployeeRace;

import java.util.Set;

public interface EmployeeRaceRepository extends MainRepository<EmployeeRace, String> {

    Set<EmployeeRace> getAll();

}
