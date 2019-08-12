package ac.za.cput.project.repository.imp;

import ac.za.cput.project.domain.EmployeeRace;
import ac.za.cput.project.repository.EmployeeRaceRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeRaceRepoImp implements EmployeeRaceRepository {

    private static EmployeeRaceRepoImp employeeRaceRepository = null;
    private Map<String,EmployeeRace> employeeRaces;

    private EmployeeRaceRepoImp(){
        employeeRaces = new HashMap<>();
    }

    public static EmployeeRaceRepoImp getEmployeeRaceRepository() {
        if (employeeRaceRepository == null){
            return new EmployeeRaceRepoImp();
        }
        return employeeRaceRepository;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return new HashSet<>(employeeRaces.values());
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        this.employeeRaces.put(employeeRace.getEmpNum(),employeeRace);
        return employeeRace;
    }

    @Override
    public EmployeeRace read(String id) {
        return employeeRaces.get(id);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        employeeRaces.replace(employeeRace.getEmpNum(),employeeRace);
        return employeeRaces.get(employeeRace.getEmpNum());
    }

    @Override
    public void delete(String id) {
        employeeRaces.remove(id);

    }
}
