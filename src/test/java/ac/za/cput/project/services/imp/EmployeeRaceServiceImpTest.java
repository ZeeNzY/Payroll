package ac.za.cput.project.services.imp;

import ac.za.cput.project.Factory.EmployeeRaceFactory;
import ac.za.cput.project.domain.EmployeeRace;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceServiceImpTest {

    private EmployeeRaceServiceImp employeeRaceService;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        this.employeeRaceService = EmployeeRaceServiceImp.getEmployeeRaceService();
        employeeRace = EmployeeRaceFactory.buildEmployeeRace("002","2");
    }

    @Test
    public void getAll() {
        Set<EmployeeRace> raceSet = employeeRaceService.getAll();
        Assert.assertNotNull(raceSet);
    }

    @Test
    public void create() {
        assertEquals(employeeRaceService.create(employeeRace),employeeRaceService.create(employeeRace));
    }

    @Test
    public void read() {
        employeeRaceService.create(employeeRace);
        EmployeeRace race = employeeRaceService.read(employeeRace.getEmpNum());
        Assert.assertNotNull(race);
    }

    @Test
    public void update() {
        employeeRaceService.create(employeeRace);
        EmployeeRace race = employeeRaceService.read(employeeRace.getEmpNum());
        employeeRace.getEmpNum();
        employeeRaceService.update(employeeRace);
        Assert.assertEquals(employeeRace.getEmpNum(),race.getEmpNum());
    }

    @Test
    public void delete() {
        employeeRaceService.create(employeeRace);
        EmployeeRace race = employeeRaceService.read(employeeRace.getEmpNum());
        Assert.assertNotNull(race);
        employeeRaceService.delete(employeeRace.getEmpNum());
        EmployeeRace raceDeleted = employeeRaceService.read(employeeRace.getEmpNum());
        Assert.assertNull(raceDeleted);
    }

}