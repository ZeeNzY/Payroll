package ac.za.cput.project.services;

import ac.za.cput.project.domain.Employee;

import java.util.Set;

public interface EmployeeService extends MainService<Employee, String>{

    Set<Employee> getAll();

}
