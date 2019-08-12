package ac.za.cput.project.services.imp;

import ac.za.cput.project.domain.EmployeeRace;
import ac.za.cput.project.repository.EmployeeRaceRepository;
import ac.za.cput.project.repository.imp.EmployeeRaceRepoImp;
import ac.za.cput.project.services.EmployeeRaceService;

import java.util.Set;

public class EmployeeRaceServiceImp implements EmployeeRaceService {

    private static EmployeeRaceServiceImp employeeRaceService = null;
    private EmployeeRaceRepository raceRepository;

    public EmployeeRaceServiceImp(){
        raceRepository = EmployeeRaceRepoImp.getEmployeeRaceRepository();
    }

    public static EmployeeRaceServiceImp getEmployeeRaceService() {
        if (employeeRaceService == null){
            return new EmployeeRaceServiceImp();
        }
        return employeeRaceService;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return raceRepository.getAll();
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        return raceRepository.create(employeeRace);
    }

    @Override
    public EmployeeRace read(String id) {
        return raceRepository.read(id);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        return raceRepository.update(employeeRace);
    }

    @Override
    public void delete(String id) {
        raceRepository.delete(id);

    }

}
