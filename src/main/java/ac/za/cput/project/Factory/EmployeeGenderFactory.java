package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String emp_id, String genderId){
        return new EmployeeGender.Builder().emp_id(emp_id)
                .gender_id(genderId)
                .build();
    }
}
