package ac.za.cput.project.repository.imp;

import ac.za.cput.project.Factory.RaceFactory;
import ac.za.cput.project.domain.Gender;
import ac.za.cput.project.domain.Race;
import ac.za.cput.project.repository.RaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepoImpTest {

    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepoImp.getRepository();
        this.race = RaceFactory.getRace("coloured");
    }

    @Test
    public void create() {
        Race races = this.repository.create(this.race);
        Assert.assertSame(races,this.race);
        getAll();
    }

    @Test
    public void update() {
        String female = "coloured";
        Gender gender = new Gender.Builder().gender(female).build();
        this.repository.update(race);
        Assert.assertSame(female, gender.getGender());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(race.getRace());
        getAll();
    }

    @Test
    public void read() {
        //Gender gender = this.repository.gender.getGender();
        //getAll();
    }

    @Test
    public void getAll() {
        Set<Race> all = this.repository.getAll();
    }

}