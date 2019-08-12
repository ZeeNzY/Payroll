package ac.za.cput.project.services.imp;

import ac.za.cput.project.domain.EmployeeGender;
import ac.za.cput.project.repository.EmployeeGenderRepository;
import ac.za.cput.project.repository.imp.EmployeeGenderRepoImp;
import ac.za.cput.project.services.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImp implements EmployeeGenderService {

    private static EmployeeGenderServiceImp employeeGenderService = null;
    private EmployeeGenderRepository employeeGenderRepository;

    public EmployeeGenderServiceImp(){
        employeeGenderRepository = EmployeeGenderRepoImp.getEmployeeGenderRepository();
    }

    public static EmployeeGenderServiceImp getEmployeeGenderService() {
        if (employeeGenderService == null){
            return new EmployeeGenderServiceImp();
        }
        return employeeGenderService;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return employeeGenderRepository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return employeeGenderRepository.create(employeeGender);
    }

    @Override
    public EmployeeGender read(String id) {
        return employeeGenderRepository.read(id);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return employeeGenderRepository.update(employeeGender);
    }

    @Override
    public void delete(String id) {
        employeeGenderRepository.delete(id);

    }
}
