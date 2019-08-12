package ac.za.cput.project.repository.imp;

import ac.za.cput.project.Factory.EmployeeGenderFactory;
import ac.za.cput.project.domain.EmployeeGender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderRepoImpTest {

    EmployeeGenderRepoImp repository;
    EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        repository = EmployeeGenderRepoImp.getEmployeeGenderRepository();
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("002","1");
    }

    @Test
    public void create() {
        assertNotNull(repository.create(employeeGender));
    }

    @Test
    public void read() {
        assertNull(repository.read(employeeGender.getEmpNum()));
    }

    @Test
    public void update() {
        assertNotNull(repository.update(employeeGender));
    }

    @Test
    public void delete() {
        repository.delete(employeeGender.getEmpNum());
    }

}