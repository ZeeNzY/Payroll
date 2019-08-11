package ac.za.cput.project.services.imp;

import ac.za.cput.project.domain.Employee;
import ac.za.cput.project.repository.EmployeeRepository;
import ac.za.cput.project.repository.imp.EmployeeRepoImp;
import ac.za.cput.project.services.EmployeeService;

import java.util.Set;

public class EmployeeServiceImp implements EmployeeService {

    private static EmployeeServiceImp service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImp(){
        this.repository = EmployeeRepoImp.getRepository();
    }

    public static EmployeeServiceImp getService(){
        if (service == null) service = new EmployeeServiceImp();
        return service;
    }
    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }
}
