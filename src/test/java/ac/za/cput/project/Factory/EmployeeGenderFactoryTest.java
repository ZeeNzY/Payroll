package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.EmployeeGender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("002","1");
    }

    @Test
    public void buildEmployeeGender() {
        Assert.assertNotNull(employeeGender);
    }

}