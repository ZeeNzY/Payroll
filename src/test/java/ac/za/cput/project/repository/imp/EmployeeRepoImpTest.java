package ac.za.cput.project.repository.imp;

import ac.za.cput.project.Factory.EmployeeFactory;
import ac.za.cput.project.domain.Employee;
import ac.za.cput.project.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRepoImpTest {

    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepoImp.getRepository();
        this.employee = EmployeeFactory.getEmployee("Zinzi","Gulwa","African","Female");
    }

    @Test
    public void create() {
        Employee emp = this.repository.create(this.employee);
        getAll();
        Assert.assertSame(emp,this.employee);
    }

    @Test
    public void update() {
        String lname = "Gulwa";
        String name = "Zinzi";
        String race = " ";
        String gender = "Female";
        Employee employees = new Employee.Builder().first_name(name).last_name(lname).build();
        this.repository.update(employees);
        Assert.assertSame(lname, employees.getLast_name());
        Assert.assertSame(name, employees.getFirst_name());
    }

    @Test
    public void delete() {
        this.repository.delete(employee.getFirst_name());
        this.repository.delete(employee.getLast_name());
    }

    @Test
    public void read() {
        Employee read = this.repository.read(employee.getFirst_name());
        getAll();
        assertNotEquals(employee, read);
    }

    @Test
    public void getAll() {
        Set<Employee> getAll = this.repository.getAll();
    }
}