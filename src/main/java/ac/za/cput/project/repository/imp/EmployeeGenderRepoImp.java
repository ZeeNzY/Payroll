package ac.za.cput.project.repository.imp;

import ac.za.cput.project.domain.EmployeeGender;
import ac.za.cput.project.repository.EmployeeGenderRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeGenderRepoImp implements EmployeeGenderRepository {

    private static EmployeeGenderRepoImp employeeGenderRepository = null;
    private Map<String, EmployeeGender> employeeGenders;

    private EmployeeGenderRepoImp(){
        employeeGenders = new HashMap<>();
    }

    public static EmployeeGenderRepoImp getEmployeeGenderRepository() {
        if (employeeGenderRepository == null){
            return new EmployeeGenderRepoImp();
        }
        return employeeGenderRepository;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return new HashSet<>(employeeGenders.values());
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        employeeGenders.put(employeeGender.getEmpNum(), employeeGender);
        return employeeGender;
    }

    @Override
    public EmployeeGender read(String id) {
        return employeeGenders.get(id);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        EmployeeGender empGenderUpdate = read(employeeGender.getEmpNum());
        if (empGenderUpdate != null){
            employeeGenders.replace(employeeGender.getEmpNum(), employeeGender);

        }

        return employeeGender;
    }

    @Override
    public void delete(String s) {
        EmployeeGender empGenderDelete = read(s);
        if (empGenderDelete != null) {
            employeeGenders.remove(s,empGenderDelete);
        }


    }
}
