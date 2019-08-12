package ac.za.cput.project.repository;

import ac.za.cput.project.domain.EmployeeGender;

import java.util.Set;

public interface EmployeeGenderRepository extends MainRepository<EmployeeGender, String> {

        Set<EmployeeGender> getAll();

}
