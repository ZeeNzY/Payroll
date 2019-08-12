package ac.za.cput.project.services.imp;

import ac.za.cput.project.Factory.EmployeeGenderFactory;
import ac.za.cput.project.domain.EmployeeGender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImpTest {

    private EmployeeGenderServiceImp employeeGenderService;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.employeeGenderService = EmployeeGenderServiceImp.getEmployeeGenderService();
        employeeGender = EmployeeGenderFactory.buildEmployeeGender("002","1");
    }

    @Test
    public void getAll() {
        Set<EmployeeGender> employeeGenders = employeeGenderService.getAll();
        Assert.assertNotNull(employeeGenders);
    }

    @Test
    public void create() {
        assertEquals(employeeGenderService.create(employeeGender),employeeGenderService.create(employeeGender));
    }

    @Test
    public void read() {
        employeeGenderService.create(employeeGender);
        EmployeeGender gender = employeeGenderService.read(employeeGender.getEmpNum());
        Assert.assertNotNull(gender);
    }

    @Test
    public void update() {
        employeeGenderService.create(employeeGender);
        EmployeeGender gender = employeeGenderService.read(employeeGender.getEmpNum());
        employeeGender.getEmpNum();
        employeeGenderService.update(employeeGender);
        Assert.assertEquals(employeeGender.getEmpNum(),gender.getEmpNum());
    }

    @Test
    public void delete() {
        employeeGenderService.create(employeeGender);
        EmployeeGender gender = employeeGenderService.read(employeeGender.getEmpNum());
        Assert.assertNotNull(gender);
        employeeGenderService.delete(employeeGender.getEmpNum());
        EmployeeGender genderDeleted = employeeGenderService.read(employeeGender.getEmpNum());
        Assert.assertNull(genderDeleted);
    }

}