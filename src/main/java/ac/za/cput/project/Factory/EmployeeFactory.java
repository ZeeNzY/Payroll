package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.Employee;
import ac.za.cput.project.domain.Gender;
import ac.za.cput.project.domain.Race;
import ac.za.cput.project.util.Misc;

public class EmployeeFactory {

    public static Employee getEmployee(String first_name, String last_name,String race, String gender){
        Race r = RaceFactory.getRace(race);
        Gender sex = GenderFactory.getGender(gender);
        return new Employee.Builder().emp_id(Misc.generateId())
                .first_name(first_name)
                .last_name(last_name)
                .race(r)
                .gender(sex)
                .build();

    }
}
