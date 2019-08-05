package ac.za.cput.project.repository.imp;

import ac.za.cput.project.domain.Employee;
import ac.za.cput.project.repository.EmployeeRepository;

import java.util.*;


public class EmployeeRepoImp implements EmployeeRepository{

    private static EmployeeRepoImp repository = null;
    private Map<String, Employee> employee;

    private EmployeeRepoImp(){
        this.employee = new HashMap<>();
    }

    public static EmployeeRepository getRepository(){
        if (repository == null) repository = new EmployeeRepoImp();
        return repository;
    }


    @Override
    public Set<Employee> getAll() {
        Collection<Employee> employees = this.employee.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public Employee create(Employee employee) {
        this.employee.put(employee.getEmpd_id(),employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
       this.employee.replace(employee.getEmpd_id(),employee);
        return this.employee.get(employee.getEmpd_id());
    }

    @Override
    public void delete(String s) {
        this.employee.remove(s);
    }

    @Override
    public Employee read(String s) {
        return this.employee.get(s);
    }
}
