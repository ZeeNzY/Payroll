package ac.za.cput.project.services.imp;

import ac.za.cput.project.Factory.GenderFactory;
import ac.za.cput.project.domain.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderServiceImpTest {

    private GenderServiceImp genderService;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.genderService = GenderServiceImp.getService();
        this.gender = GenderFactory.getGender("female");
    }

    @Test
    public void getAll() {
        Set<Gender> genders = genderService.getAll();
        Assert.assertNotNull(genders);
    }

    @Test
    public void create() {
        Gender genders = genderService.create(gender);
        Assert.assertSame(genders,this.gender);
    }

    @Test
    public void read() {
        Gender genders = genderService.read(gender.getGender());
        getAll();
        assertNotEquals(gender, genders);
    }

    @Test
    public void update() {
        gender = GenderFactory.getGender("female");

        genderService.create(gender);

        assertNotEquals(gender, genderService);

    }

    @Test
    public void delete() {
    }

}