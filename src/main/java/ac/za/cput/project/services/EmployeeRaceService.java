package ac.za.cput.project.services;

import ac.za.cput.project.domain.EmployeeRace;

import java.util.Set;

public interface EmployeeRaceService extends MainService<EmployeeRace, String> {

    Set<EmployeeRace> getAll();

}
