package ac.za.cput.project.services.imp;

import ac.za.cput.project.Factory.EmployeeFactory;
import ac.za.cput.project.domain.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceImpTest {

    private EmployeeServiceImp employeeService;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.employeeService = EmployeeServiceImp.getService();
        this.employee = EmployeeFactory.getEmployee("Zinzi","Gulwa","African","Female");
    }

    @Test
    public void getAll() {
        Set<Employee> employees = employeeService.getAll();
        Assert.assertNotNull(employees);
    }

    @Test
    public void create() {
        Employee emp =employeeService.create(employee);
        Assert.assertSame(emp,this.employee);
    }

    @Test
    public void read() {
        Employee read = employeeService.read(employee.getFirst_name());
        getAll();
        assertNotEquals(employee, read);
    }

    @Test
    public void update() {
        employee = EmployeeFactory.getEmployee("Zinzi","Gulwa","African","Female");

        employeeService.create(employee);

        assertNotEquals(employee, employeeService);

    }

    @Test
    public void delete() {
    }

}