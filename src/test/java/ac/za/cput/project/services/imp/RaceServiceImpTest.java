package ac.za.cput.project.services.imp;

import ac.za.cput.project.Factory.RaceFactory;
import ac.za.cput.project.domain.Race;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceImpTest {

    private RaceServiceImp raceService;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.raceService = RaceServiceImp.getService();
        this.race = RaceFactory.getRace("Coloured");
    }

    @Test
    public void getAll() {
        Set<Race> employees = raceService.getAll();
        Assert.assertNotNull(employees);
    }

    @Test
    public void create() {
        Race races =raceService.create(race);
        Assert.assertSame(races,this.race);
    }

    @Test
    public void read() {
        Race races = raceService.read(race.getRace());
        getAll();
        assertNotEquals(race, races);
    }

    @Test
    public void update() {
        race = RaceFactory.getRace("Coloured");

        raceService.create(race);

        assertNotEquals(race, raceService);

    }

    @Test
    public void delete() {
    }

}