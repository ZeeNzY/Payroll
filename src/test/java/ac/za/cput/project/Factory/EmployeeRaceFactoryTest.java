package ac.za.cput.project.Factory;

import ac.za.cput.project.domain.EmployeeRace;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {

    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        employeeRace = EmployeeRaceFactory.buildEmployeeRace("002","1");
    }

    @Test
    public void buildEmployeeGender() {
        Assert.assertNotNull(employeeRace);
    }

}