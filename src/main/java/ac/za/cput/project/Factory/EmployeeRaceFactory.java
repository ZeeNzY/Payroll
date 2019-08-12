package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.EmployeeRace;

public class EmployeeRaceFactory {

    public static EmployeeRace buildEmployeeRace(String emp_id, String race_id){
        return new EmployeeRace.Builder().emp_id(emp_id)
                .race_id(race_id)
                .build();
    }
}
