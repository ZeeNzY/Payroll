package ac.za.cput.project.repository.imp;

import ac.za.cput.project.Factory.EmployeeRaceFactory;
import ac.za.cput.project.domain.EmployeeRace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceRepoImpTest {

    private EmployeeRaceRepoImp repository;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        repository = EmployeeRaceRepoImp.getEmployeeRaceRepository();
        employeeRace = EmployeeRaceFactory.buildEmployeeRace("002","1");
    }

    @Test
    public void create() {
        assertNotNull(repository.create(employeeRace));
    }

    @Test
    public void read() {
        assertNull(repository.read(employeeRace.getEmpNum()));
    }

    @Test
    public void update() {
        assertNull(repository.update(employeeRace));
    }

    @Test
    public void delete() {
        repository.delete(employeeRace.getEmpNum());
    }

}