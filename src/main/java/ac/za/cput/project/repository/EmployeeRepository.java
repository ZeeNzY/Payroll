package ac.za.cput.project.repository;

import ac.za.cput.project.domain.Employee;

import java.util.Map;
import java.util.Set;

public interface EmployeeRepository extends MainRepository<Employee, String> {

    Set<Employee> getAll();
}
