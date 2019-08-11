package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.Employee;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {
        String name = "Zinzi";
        String last_name = "Gulwa";
        String race = "coloured";
        String gender = "female";

        Employee employee = EmployeeFactory.getEmployee(name,last_name,race,gender);
       // String details[4]  {};

        Assert.assertNotEquals(employee, name+",");
    }

}