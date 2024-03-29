package ac.za.cput.project.repository.imp;

import ac.za.cput.project.Factory.GenderFactory;
import ac.za.cput.project.domain.Gender;
import ac.za.cput.project.repository.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepoImpTest {

    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepoImp.getRepository();
        this.gender = GenderFactory.getGender("female");
    }

    @Test
    public void create() {
        Gender genders = this.repository.create(this.gender);
        Assert.assertSame(genders,this.gender);
        getAll();
    }

    @Test
    public void update() {
        String female = "female";
        Gender gender = new Gender.Builder().gender(female).build();
        this.repository.update(gender);
        Assert.assertSame(female, gender.getGender());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(gender.getGender());
        getAll();
    }

    @Test
    public void read() {
        //Gender gender = this.repository.gender.getGender();
        //getAll();
    }

    @Test
    public void getAll() {
        Set<Gender> all = this.repository.getAll();
    }
}