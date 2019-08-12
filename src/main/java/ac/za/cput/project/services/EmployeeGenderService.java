package ac.za.cput.project.services;

import ac.za.cput.project.domain.EmployeeGender;

import java.util.Set;

public interface EmployeeGenderService extends MainService<EmployeeGender, String> {

    Set<EmployeeGender> getAll();
}
